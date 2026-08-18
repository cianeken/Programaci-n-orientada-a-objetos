public class Veterinaria {
    
    public static void main(String[] args) {
        
        Perro perro_alberto = new Perro();
        Perro perro_franco = new Perro();
        Perro perro_amaro = new Perro();

        perro_alberto.raza_perro = "Golden Retriever";
        perro_alberto.edad_perro = 14;
        perro_alberto.tamano_perro = 1.3;

        perro_franco.raza_perro = "Akita Americano";
        perro_franco.edad_perro = 4;
        perro_franco.tamano_perro = 1;

        perro_amaro.raza_perro = "Hasuki";
        perro_amaro.edad_perro = 2;
        perro_amaro.tamano_perro = 1.5;

        System.out.println("******Bienvenidos a la veterinaria mas Bacan del mundo mundial");

        System.out.println("Datos del perro de Alberto");
        System.out.println(perro_alberto.raza_perro);
        System.out.println(perro_alberto.edad_perro);
        System.out.println(perro_alberto.tamano_perro);

        System.out.println("Datos del perro de Franco");
        System.out.println(perro_franco.raza_perro);
        System.out.println(perro_franco.edad_perro);
        System.out.println(perro_franco.tamano_perro);

        System.out.println("Datos del perro de Amaro");
        System.out.println(perro_amaro.raza_perro);
        System.out.println(perro_amaro.edad_perro);
        System.out.println(perro_amaro.tamano_perro);

        System.out.println("====== Acciones de los Perros ======");

        String ladrar_perro_alberto =  perro_alberto.ladrar();

        System.out.println("El perro de Alberto va a ladrar, miren: ");
        System.out.println(ladrar_perro_alberto);

    }

}