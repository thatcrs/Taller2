package taller2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class descendientes implements List<descendientes> {
	
	private String nombre;
	private int edad;
	private String rut;
	private String rut_madre;
	private progenitores rut_padre;
	
	
	public descendientes(String nombre, int edad, String rut, String rut_madre, String rut_padre) {
		
		
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
		this.rut_madre = rut_madre;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public String getRut_madre() {
		return rut_madre;
	}


	public void setRut_madre(String rut_madre) {
		this.rut_madre = rut_madre;
	}


	public progenitores getRut_padre() {
		return rut_padre;
	}


	public void setRut_padre(progenitores rut_padre) {
		this.rut_padre = rut_padre;
	}


	@Override
	public String toString() {
		return "descendientes [nombre=" + nombre + ", edad=" + edad + ", rut=" + rut + ", rut_madre=" + rut_madre
				+ ", rut_padre=" + rut_padre + "]";
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Iterator<descendientes> iterator() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean add(descendientes e) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean addAll(Collection<? extends descendientes> c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean addAll(int index, Collection<? extends descendientes> c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public descendientes get(int index) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public descendientes set(int index, descendientes element) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void add(int index, descendientes element) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public descendientes remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public ListIterator<descendientes> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ListIterator<descendientes> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<descendientes> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}