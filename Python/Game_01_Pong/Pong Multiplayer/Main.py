import sys

import pygame

print('game has started')

# set screen size
pauseCount = 0
x = 800
y = 400

# initialize screen

spentTime = 0


# set start positions for player 1 and 2
player1x = 50
player1y = 200
player1width = 20
player1height = 80
player1rad = 10
player1score = 0
player1y_change = 0

player2x = 750
player2y = 200
player2width = 20
player2height = 80
player2rad = 10
player2score = 0
player2y_change = 0

ballx = 400
bally = 200
ballrad = 10
ballx_change = 0.1
bally_change = 0.1

'''
Ball Logik:
Wenn der Ball Abgeprallt wird geht er in die gegnerische richtung
einfallswinkel == ausfallswinkel
'''


def ballaufschlag():
    global ballx_change
    if ballx == 50:
        print("Ball kommt auf ersten Spieler zu!")
        ballx_change = 0.1
    if ballx == 750:
        print("Ball kommt auf zweiten Spieler zu!")
        ballx_change += 1






# initialize players
pygame.init()
pygame.display.set_caption("Maruthan's PONG MULTIPLAYER")
screen = pygame.display.set_mode((x, y))


# set font
score1value = 0
score2value =0
font = pygame.font.SysFont("Bauhaus 93 ", 32)
pygame.display.flip()

def show_score(sx, sy):
    score1 = font.render(str(score1value), True, (255, 255, 0))
    score2 = font.render(str(score2value),True,(255,255,0))
    screen.blit(score1, (10, 10))
    screen.blit(score2, (770, 10))

activated = False
while True:

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            sys.exit()
        if event.type == pygame.KEYDOWN:
            activated = True
            if event.key == pygame.K_UP:
                player2y_change = -0.1
            if event.key == pygame.K_DOWN:
                player2y_change = 0.1
            if event.key == pygame.K_w:
                player1y_change = -0.1
            if event.key == pygame.K_s:
                player1y_change = 0.1
            if event.key == pygame.K_ESCAPE:
                pauseCount += 1
                if pauseCount % 2 != 0:
                    player1y_change = 0
                    player2y_change = 0
                else:
                    player1y_change = 0.05
                    player2y_change = 0.05

    if player1y <= 0:
        player1y_change = 0.1
    if player1y >= 320:
        player1y_change = -0.1

    if player2y <= 0:
        player2y_change = 0.1
    if player2y >= 320:
        player2y_change = -0.1

    if 741 >= ballx >= 740 and player2y + 10 <= bally <= player2y + 70:
        ballx_change = -0.1
        print("hit Player 2 ")
        score2value+=1
        if bally_change == 0.1:
            bally_change == -0.1
    if 79 <= ballx <= 80 and player1y + 10 <= bally <= player1y + 70:
        ballx_change = 0.1
        print("hit Player 1")
        score1value+=1

    if bally <= 10:
        bally_change = 0.1
        print("Ball hit the ceiling")
    if bally >= 390:
        bally_change = -0.1
        print("Ball hit the floor")


    if ballx <= 10:
        player2score += 1
        ballx_change = 0.1
        bally_change*=-1

    if ballx >= 790:
        player1score += 1
        ballx_change = -0.1
        bally_change*=-1

    player1y += player1y_change
    player2y += player2y_change

    ballx += ballx_change
    bally += bally_change


    screen.fill((0, 0, 0))
    player1 = pygame.draw.rect(screen, (255, 0, 0), (player1x, player1y, player1width, player1height), 0)
    player2 = pygame.draw.rect(screen, (0, 123, 255), (player2x, player2y, player2width, player2height), 0)
    ball = pygame.draw.circle(screen, (255, 251, 0), (ballx, bally), ballrad)
    show_score(10,10)

    pygame.display.update()
