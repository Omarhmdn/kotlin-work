# Task 12.1: Point class
import math

class Point:
      def __init__(self,x,y):
          self.x = x
          self.y = y
      def distance(self):
          point_distance = math.sqrt((self.x**2) + (self.y**2))
          print(point_distance)


      def distanceTo(self, a, b):
          point_distanceTo = math.sqrt(((a - self.x)**2) + ((b - self.y)**2))
          print(point_distanceTo)

