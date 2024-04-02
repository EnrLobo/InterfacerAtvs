package pkginterface;

/**
 *
 * @author Quiqu
 */
public class Retangulo implements AreaCalculavel{
    
    private int altura;
    private int largura;
    
    public Retangulo(int largura, int altura){
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return this.largura * this.altura;
    }
    
}
