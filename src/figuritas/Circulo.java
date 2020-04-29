package figuritas;

public class Circulo implements figurita{
	
	private double radio;
	
	public Circulo(double radio)
	{
		this.setRadio(radio);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	@Override
	public double area()
	{
		return Math.PI * (Math.pow(this.getRadio(), 2));
	}
	@Override
	public double perimetro()
	{
		return (Math.PI * 2) * this.getRadio();
	}
	
}
