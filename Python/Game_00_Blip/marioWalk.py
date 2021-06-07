import pygame
import sys
import random

pygame.init()

x = 500
y = 500
pause = False
screen = pygame.display.set_mode((x, y))  # creates a screen with width x, height y

playerX = 245
playerY = 390
playerWidth = 10
playerHeight = 10
playerX_change = 0
playerY_change = 0

fieldX = 0
fieldY = 400
fieldWidth = 500
fieldHeight = 100
fieldX_change = 0
fieldY_change = 0

# score

scoreValue = 0
scoreX = 10
scoreY = 10
font = pygame.font.SysFont("Bauhaus 93 ", 32)


def show_score(sx, sy):
    score = font.render('Score ' + str(scoreValue), True, (255, 255, 0))
    screen.blit(score, (sx, sy))


playerImg = pygame.image.load('player.png')

pygame.display.set_caption("Blip")  # Window title
pygame.display.set_icon(playerImg)  # Window icon


def player(px, py):
    pygame.draw.rect(screen, (255, 0, 0), (px, py, playerWidth, playerHeight))


def field(fx, fy):
    pygame.draw.rect(screen, (100, 0, 100), (fx, fy, fieldWidth, fieldHeight))


whileCondition = True
started = False
while whileCondition:
    screen.fill((20, 10, 50))

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()
            sys.exit()

        if event.type == pygame.KEYDOWN:

            if event.key == pygame.K_RETURN:
                started = True
                fieldX_change = -0.1
            if event.key == pygame.K_UP:
                playerY_change = -0.3
            if event.key == pygame.K_DOWN:
                playerY_change = 0.3

        if event.type == pygame.KEYUP:

            if event.key == pygame.K_RIGHT or event.key == pygame.K_LEFT or event.key == pygame.K_UP or event.key == pygame.K_DOWN:
                playerX_change = 0
                playerY_change = 0

    playerX = playerX + playerX_change
    playerY = playerY + playerY_change
    fieldX = fieldX + fieldX_change

    if playerY <= 0:
        playerY = 0
    if playerY >= 490:
        playerY = 490

    if playerX + 10 > fieldX and playerX < fieldX + 500 and playerY > fieldY and playerY < fieldY + 100:
        print("Touched")
        whileCondition = False

    if started:
        scoreValue += 1

        fieldX_change = scoreValue / -1000000

    if fieldX <= -500:
        fieldX = 501
        fieldY = random.randint(0, 400)
        field(fieldX, fieldY)

    fieldX_change = -0.2
    player(playerX, playerY)
    field(fieldX, fieldY)
    show_score(scoreX, scoreY)
    pygame.display.flip()

pygame.quit()
sys.exit()
