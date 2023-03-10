package paolaejer;


public abstract class Formas {
protected String color;

public String getColor() {
return color;
}

public void setColor(String color) {
this.color = color;
}

protected abstract void dibujar();

}


package paolaejer;


public class Circulo extends Formas {

private double radio;
private static final double PI = Math.PI;
private double area;
private double contorno;


protected void dibujar() {

}

public double getRadio() {
return radio;
}

public void setRadio(double radio) {
this.radio = radio;
}

public double getArea() {
return area;
}

public void setArea(double area) {
this.area = area;
}

public double getContorno() {
return contorno;
}

public void setContorno(double contorno) {
this.contorno = contorno;
}

public double calcularArea(double radio) {
this.area = 0;
this.radio = radio;
if (this.radio > 0) {
area = PI * this.radio * this.radio;
}
return this.area;
}
}


package paolaejer;


public class Linea extends Formas {

private double largo;

public double getLargo() {
return largo;
}

public void setLargo(double largo) {
this.largo = largo;
}


protected void dibujar() {

}

}
package paolaejer;


public class Triangulo extends Formas {

private double base;
private double altura;
private double angulo;

public double getBase() {
return base;
}

public void setBase(double base) {
this.base = base;
}

public double getAltura() {
return altura;
}

public void setAltura(double altura) {
this.altura = altura;
}

public double getAngulo() {
return angulo;
}

public void setAngulo(double angulo) {
this.angulo = angulo;
}

public double calcularArea(double base, double altura) {
double area = 0;
this.base = base;
this.altura = altura;

if (this.base > 0 && this.altura > 0) {
area = (this.base * this.altura) / 2;
}
return area;
}


protected void dibujar() {

}

}
package paolaejer;


public class Cuadrado extends Formas {

private double lado;

public double getLado() {
return lado;
}

public void setLado(double lado) {
this.lado = lado;
}


protected void dibujar() {

}

public double area(double lado) {
double area = 0;
this.lado = lado;
if (this.lado > 0) {
area = Math.pow(lado, 2);
}
return area;
}
}