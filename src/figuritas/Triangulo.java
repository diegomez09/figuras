package figuritas;

public class Triangulo implements figurita{

	private double base, altura;
	
	public Triangulo(double base, double altura)
	{
		this.setBase(base);
		this.setAltura(altura);
	}

	@Override
	public double area()
	{
		return (this.getBase() * this.getAltura()) / 2;
	}
	
	@Override
	public double perimetro()
	{
		return this.getBase() * 3;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}




	
	
}
