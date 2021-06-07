import pygame
import sys

leben=100

x=800
y=800

sx=50
sy=50

shohe=10
sbreite=10

fx=40
fy=40

pygame.init()

screen=pygame.display.set_mode([x,y])
screen.fill((43,107,59))

pygame.draw.rect(screen,(140,36,36),(sx,sy,sbreite,shohe), 0)
pygame.display.flip()

while leben>0:
	for event in pygame.event.get():
		if event.type==pygame.quit: sys.exit()
	leben = leben - 1
	screen.fill((0,0,0))