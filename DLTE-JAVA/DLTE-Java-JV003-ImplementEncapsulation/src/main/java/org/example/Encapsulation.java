package org.example;

public class Encapsulation {
    public static void main(String[] args) {

        customer deposits=new customer();

        deposits.openDeposits();

    }

}

class customer{

    public void openDeposits(){

        //int loanNumber=123;

        class request{

            private String customerName;

            private int PAN;

            private long Aadhaar;

            private String profession;

            private double cibil;

            private long contact;


            public String request() {

                return customerName;


            }


            public void setCustomerName(String customerName) {

                this.customerName = customerName;

            }


            public String getCustomerName() {

                return customerName;

            }


            public void setProfession(String profession ) {

                this.profession = profession;

            }

            public String getProfession(){

                return profession;

            }


            public long getAadhaar() {

                return Aadhaar;

            }


            public void setAadhaar(int Aadhaar) {

                this.Aadhaar = Aadhaar;

            }

            public void setCibil(int cibil){

                this.cibil=cibil;

            }

            public double getCibil(){

                return cibil;

            }


            public int getPAN() {

                return PAN;

            }


            public void setPAN(int PAN) {

                this.PAN = PAN;

            }


            // constructor overloading


            // default constructor

            public request(){}

            // parameterized constructor

            public request(String customerName, int PAN, int Aadhaar, String profession, double cibil, int contact)

            {

                this.customerName=customerName;

                this.PAN=PAN;

                this.Aadhaar=Aadhaar;

                this.profession=profession;

                this.cibil=cibil;

                this.contact=contact;

            }

        }

        request fixed=new request();

        fixed.setCustomerName("amrutha");

        fixed.setPAN(9964);

        fixed.setAadhaar(12343);

        fixed.setProfession("Dancer");


        System.out.println(fixed.getCustomerName()+" "+fixed.getAadhaar()+"  "+fixed.getCibil());


        request fde=new request("amrutha",4907,1045760,"dancer",1234.6,5984);


        System.out.println(fde.getAadhaar()+" "+fde.getPAN()+" "+fde.getCustomerName());

        System.out.println("request for loan received");

    }

}
