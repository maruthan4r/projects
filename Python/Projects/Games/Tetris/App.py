import pygame
import sys
pygame.init()

x=200
y=800


startScreen=pygame.display.set_mode((x,y))

excecuting=True

while excecuting:
    for event in pygame.event:
        if event.type() == pygame.QUIT:
            pygame.QUIT
            sys.quit()