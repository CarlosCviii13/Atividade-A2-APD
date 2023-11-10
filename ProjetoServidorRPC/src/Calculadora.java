public class Calculadora {

    //Para Calcular de area do Quadrado
    public int AreaQuadrado(int lado) {
        return lado * lado;
    }    

    //Para Calcular de area do Triangulo
    public int AreaTrianguloRetangulo(int base, int altura) {
        //parenteses não são necessários mas são por melhor entendimento
        return (base * altura) / 2;
    }

    //Para Calcular de area da Circunferencia
    public double AreaCircunferencia(int raio) { 
        //double foi utilizado pois PI não é inteiro
        //math.PI é para utilizar a constante de pi
        return Math.PI * (raio * raio);
    }

    //Para Calcular de area da Esfera
	public double AreaEsfera(int raio) {
        return 4 * Math.PI * (raio * raio);
    }

    //Para calcular o volume da Esfera
    public double VolumeEsfera(int raio) {
        return (4.0 / 3.0) * Math.PI * (raio * raio * raio);
    }

    //Para calcular a area do Cilindro
    public double AreaCilindro(int raio, int altura) {
        return 2 * Math.PI * raio * (raio + altura);
    }

    //Para calcular o volume do Cilindro
    public double VolumeCilindro(int raio, int altura) {
        return Math.PI * (raio * raio) * altura;
    }

    //Para calcular a area do Cubo
    public int AreaCubo(int lado) {
        return 6 * (lado * lado);
    }
    
    //Para calcular do volume do Cubo
    public int VolumeCubo(int lado) {
        return lado * lado * lado;
    }
    
}