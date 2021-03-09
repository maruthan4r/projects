import pygame
import random
import sys

# initialize the pygame
pygame.init()

# create the screen
screen = pygame.display.set_mode((800, 600))

# background

background = pygame.image.load('background.png')
# Title and Icon

# set Title
pygame.display.set_caption("Space invaders")

# set Title Icon
icon = pygame.image.load('spaceship.png')
pygame.display.set_icon(icon)

# Player
playerImg = pygame.image.load('player.png')
playerX = 370
playerY = 480
playerX_change = 0

# Enemy
enemyImg = pygame.image.load('enemy.png')
enemyX = random.randint(0, 800)
enemyY = random.randint(50, 150)
enemyX_change = 0.3
enemyY_change = 40

def player(x, y):
    screen.blit(playerImg, (x, y))


def enemy(x, y):
    screen.blit(enemyImg, (x, y))


# Game Loop

while True:

    # color background ( (r,g,b) )
    screen.fill((0, 0, 0))
    # Background Image
    screen.blit(background,(0, 0))

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()
            sys.exit()

        # if keystroke is pressed check wheter its right or left
        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_LEFT:
                print("LEFT")
                playerX_change = -0.7

            if event.key == pygame.K_RIGHT:
                print("RIGHT")
                playerX_change = 0.7
        if event.type == pygame.KEYUP:
            if event.key == pygame.K_LEFT or event.key == pygame.K_RIGHT:
                print("Keystroke has been released!")
                playerX_change = 0

# checking for boundaries for player
    playerX += playerX_change

    if playerX <= 0:
        playerX = 0
    elif playerX >= 736:
        playerX = 736

# enemy movemet
    enemyX += enemyX_change

    if enemyX <= 0:
        enemyX_change = 0.7
        enemyY+=enemyY_change
    elif enemyX >= 736:
        enemyY += enemyY_change
        enemyX_change = -0.7




    player(playerX, playerY)
    enemy(enemyX, enemyY)
    pygame.display.update()
