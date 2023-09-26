package TipeData;

public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        /*
         =================================================
         | Tipe Data Primitif | Tipe Data Bukan Primitif |
         =================================================
         | byte               | Byte                     |
         | short              | Short                    |
         | int                | Integer                  |
         | long               | Long                     |
         | float              | Float                    |
         | double             | Double                   |
         | char               | Character                |
         | boolean            | Boolean                  |
         =================================================
         */

         Integer iniInteger = 10;
         Long iniLong = 10L;
         Boolean iniBoolean = true;

         Short iniShort; //null karena ini default object


        //  int >> Integer > int
         int age = 18;
         Integer ageObject = age;
         int ageAgain = ageObject;

        //  Integer >> short
         short shortAge = ageObject.shortValue();

        //  Integer >> byte
         byte byteAge = ageObject.byteValue();
    }
}
