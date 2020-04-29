package figuritas;

public class Rectangulo implements figurita{

	private double base	 	= 0;
	private double altura	= 0;
	
	public Rectangulo(double base, double altura)
	{
		this.setAltura(altura);
		this.setBase(base);
	}

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
	
	@Override
	public double area()
	{
		return this.getBase() * this.getAltura();
	}
	
	@Override
	public double perimetro()
	{
		return (this.getBase() * 2) + (this.getAltura() * 2);
	}
}
