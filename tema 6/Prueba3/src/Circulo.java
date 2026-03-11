class Circulo {
    final float PI;
    final String color;
    double radio;
    
    public Circulo(float pI, String color, double radio) {
        PI = pI;
        this.color = color;
        this.radio = radio;
    }
    


    public void mostrarDatos() {
        System.out.println("Color = " +color);
        System.out.println("Radio = " +radio);
        System.out.println(" Area = " +calcularArea(radio,PI));

    }

    private double calcularArea(double radio, float pI) {
        double area = PI*Math.pow((radio), 2);
        return area;
    }
}
