package principal;

//FIXME La marca no tiene conceptualmente ningun comportmiento definido, 
//es solo una interfaz (un conjunto de mensajes que objetos como armani o sarkany
//van a entender).
//La interfaz en Smalltlk no hay que declararla, pero acá sí.
//Entonces, no declaren a Marca como una clase abstracta con sólo métodos abstractos,
//sino como una interface Marca.
//Recuerden que no es necesario tener herencia para tener polimorfismo. 
public abstract class Marca {

	protected abstract double coeficienteMarcaCon(double unPrecio);

}
