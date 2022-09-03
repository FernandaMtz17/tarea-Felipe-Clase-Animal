package tareaClaseAbs;

public abstract class Animal {

	//Atributos
	String animalitoName;
	
	
	//Metodos
	public abstract void desplazarse();
	public abstract void hacerSonido();
	
}//Class
////////////////////////
class Delfin extends Animal{

	@Override
	public void desplazarse() {
		System.out.println("El delfín nada por el mar feliz");
		
	}

	@Override
	public void hacerSonido() {
		System.out.println("El delfín hace sonidos graciosos en el mar");
		
	}
	
}// Delfin
////////////////////////////
class Pajaro extends Animal{

	@Override
	public void desplazarse() {
		System.out.println("El Pajaro vuela muy alto");
		
	}

	@Override
	public void hacerSonido() {
		System.out.println("El pajaro canta muy lindo");
		
	}
}// Pajaro

////////////////////////////////////////
class Perro extends Animal{

	@Override
	public void desplazarse() {
		System.out.println("El Perro corre rapido");
		
	}

	@Override
	public void hacerSonido() {
		System.out.println("El Perro ladra mucho");
		
	}
}// Perro
///////////////////////////////
class Jirafa extends Animal{

	@Override
	public void desplazarse() {
		System.out.println("La Jirafa camina lento");
		
	}

	@Override
	public void hacerSonido() {
		System.out.println("La Jirafa es muda");
		
	}
}// Jirafa
///////////////////////////////////
class Oruga extends Animal{

	@Override
	public void desplazarse() {
		System.out.println("La Oruga se arrastra por el suelo");
		
	}

	@Override
	public void hacerSonido() {
		System.out.println("La Oruga hace un sonido muy quedito");
		
	}
}//
