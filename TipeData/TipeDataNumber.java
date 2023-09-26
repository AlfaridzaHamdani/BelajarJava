package TipeData;

public class TipeDataNumber {
    /*
     INTEGER NUMBER
     ====================================================================================================
     | TIPE DATA    | MIn                           | Max                       | Size      | Default   |
     ====================================================================================================
     | byte         | -128                          | 127                       | 1 byte    | 0         |
     | short        | -32,768                       | 32,767                    | 2 byte    | 0         |
     | int          | -2,147,483,648                | 2,147,483,647             | 4 byte    | 0         |
     | long         | -9,223,327,036,854,775,808    | 9,223,327,036,854,775,807 | 8 byte    | 0         |
     | float        | 3.4e-038                      | 3.4e+038                  | 4 byte    | 0.0       |
     | double       | 1.7e-308                      | 1.7e+308                  | 8 byte    | 0.0       |
     ====================================================================================================
     */

     byte iniByte = 100;
     short iniShort = 1000;
     int iniInt = 100000;
     long iniLong = 1000000;
     long iniLong2 = 100000L;

     float iniFloat = 10.12F;
     double iniDouble = 12.2424;

     int decimalInt = 25;
     int hexInt = 0xA132B;
     int binInt = 0b01010101;

     long balance = 1_000_000_000L;
     int sum = 60_000_000;

    /*
     Konversi Tipe Data Number
     otomatis: byte > short > int > long > float > double
     manual: double > float > long > int > short > byte
     */

     
}
