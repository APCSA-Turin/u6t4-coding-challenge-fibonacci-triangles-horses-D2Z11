package com.example.project;

public class Triangle {
    // array of Point objects
    private Point[] vertices;
    
    // Constructor: initializes the vertices array
    // to contain the three Point objects
    public Triangle(Point p1, Point p2, Point p3) {
      vertices = new Point[3];
      vertices[0] = p1;
      vertices[1] = p2;
      vertices[2] = p3;
    }
    
    // Returns the perimeter of the Triangle
    // HINT: use the distanceTo method that you wrote in the Point class
    public double perimeter() {
      Point p1 = vertices[0];
      Point p2 = vertices[1];
      Point p3 = vertices[2];
      return p1.distanceTo(p2) + p2.distanceTo(p3) + p3.distanceTo(p1);
    }
  
    // Returns a String with the three vertices that make up the Triangle;
    // if the vertices are the points (6, 10), (11, 15), and (18, 7),
    // this method should return: "[(6, 10), (11, 15), (18, 7)]"
    public String triangleInfo() {
      String str = "[";
      for (int i = 0; i < vertices.length; i++) {
        str += vertices[i].pointInfo() + ", ";
      }
      str = str.substring(0, str.length() - 2);
      str += "]";
      return str;
    }

    public Point[] getVertices() {
      return vertices;
    }

    public void updatePoints(Point[] v) {
      vertices = v;
    }
  }
  