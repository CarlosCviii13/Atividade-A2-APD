public class Calculadora {

    //calculo de area do quadrado
    public int AreaQuadrado(int lado) {
        return lado * lado;
    }    

    //calculo de area do triangulo
    public int AreaTrianguloRetangulo(int base, int altura) {
        //parenteses não são necessários mas são por melhor entendimento
        return (base * altura) / 2;
    }

    //calculo da area da circunferencia
    public double AreaCircunferencia(int raio) { 
        //double foi utilizado pois PI não é inteiro
        //math.PI é para utilizar a constante de pi
        return Math.PI * (raio * raio);
    }

    //calculo da area da esfera
	public double AreaEsfera(int raio) {
        return 4 * Math.PI * (raio * raio);
    }

    //calculo do volume da esfera
    public double VolumeEsfera(int raio) {
        return (4.0 / 3.0) * Math.PI * (raio * raio * raio);
    }

    //calculo da area do cilindro
    public double AreaCilindro(int raio, int altura) {
        return 2 * Math.PI * raio * (raio + altura);
    }

    //calculo do volume do cilindro
    public double VolumeCilindro(int raio, int altura) {
        return Math.PI * (raio * raio) * altura;
    }

    //calculo da area do cubo
    public int AreaCubo(int lado) {
        return 6 * (lado * lado);
    }
    
    //calculo do volume do cubo
    public int VolumeCubo(int lado) {
        return lado * lado * lado;
    }
    
}