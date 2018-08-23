package builder;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        User user = new User.UserBuilder("Jan","Kowalski")
                .age(21)
                .email("jan.kowalski@wp.pl")
                .city("Bydgoszcz")
                .adress("Wyszynskiego 1 / 20")
                .postalCode("85-028")
                .telephoneNumber("+48-500-600-700")
                .build();
        System.out.println(user.toString());

    }
}
