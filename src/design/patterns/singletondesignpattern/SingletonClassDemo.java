package design.patterns.singletondesignpattern;
//Ensure a class has only one instance and provide global point of access to it
//it is example of Lazy initialization
class SingletonClass {

	private static SingletonClass instance=null;
	private SingletonClass() {
		
	}
	public static SingletonClass getInstance() {
		if(instance==null) {
			synchronized (SingletonClass.class) {
				if (instance==null) {
					instance = new SingletonClass();
				  }
				}
			}
		return instance;
		}
	}

class SingletonClassDemo{
	public static void main(String[] args) {
		SingletonClass singletonClass = null;
		singletonClass.getInstance();
		System.out.println(singletonClass.getInstance());
		System.out.println(singletonClass.getInstance());
		System.out.println(singletonClass.getInstance());
		System.out.println(singletonClass.getInstance());
	}
}