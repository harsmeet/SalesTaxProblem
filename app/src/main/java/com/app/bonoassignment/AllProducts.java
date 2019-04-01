package com.app.bonoassignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import java.math.BigDecimal;


public class AllProducts extends  Fragment{


    CheckBox book,cD,chocolate,importedChocolate,importedPerfume,importedPerfume2,perfume,pills,importedChocolate2;

    Double Total;

    Button btn_confirm_prices,btn_clear_prices;



    String category ="";

    Integer tax = 0;

    Double importduty = 0.05;


    Double importedPerfumetotal = Double.valueOf(0);
    Double importedchocolateTotal = Double.valueOf(0);
    Double bookTotal = Double.valueOf(0);
    Double bookTax = Double.valueOf(0);
    Double cDTotal = Double.valueOf(0);
    Double chocolate2Total = Double.valueOf(0);
    Double importedPerfumetotal2 = Double.valueOf(0);
    Double perfumetotal = Double.valueOf(0);
    Double pillstotal = Double.valueOf(0);
    Double importedchocolate3Total = Double.valueOf(0);
    Double importedPerfumeTax = Double.valueOf(0);
    Double importedchocolateTax = Double.valueOf(0);
    Double cDTax = Double.valueOf(0);
    Double chocolate2Tax = Double.valueOf(0);
    Double importedPerfumeTax2 = Double.valueOf(0);
    Double perfumeTax = Double.valueOf(0);
    Double pillsTax = Double.valueOf(0);
    Double importedchocolate3Tax = Double.valueOf(0);


    Double TotalPrice,TotalTax;


//
//    Double importedPerfumetotal,importedchocolateTotal,bookTax,cDTotal,bookTotal,chocolate2Total,importedPerfumetotal2,perfumetotal,pillstotal,importedchocolate3Total;
//    Double importedPerfumeTax,importedchocolateTax,cDTax,chocolate2Tax,importedPerfumeTax2,perfumeTax,pillsTax,importedchocolate3Tax;
//
//



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);

        View rootView = inflater.inflate(R.layout.allproducts, container, false);



        book = (CheckBox)rootView.findViewById(R.id.checkbox);
        cD = (CheckBox)rootView.findViewById(R.id.checkbox1);
        chocolate = (CheckBox)rootView.findViewById(R.id.checkbox2);
        importedChocolate = (CheckBox)rootView.findViewById(R.id.checkbox3);
        importedPerfume= (CheckBox)rootView.findViewById(R.id.checkbox4);
        importedPerfume2 = (CheckBox)rootView.findViewById(R.id.checkbox5);
        perfume = (CheckBox)rootView.findViewById(R.id.checkbox6);
        pills = (CheckBox)rootView.findViewById(R.id.checkbox7);
        importedChocolate2 = (CheckBox)rootView.findViewById(R.id.checkbox8);
        btn_confirm_prices = (Button) rootView.findViewById(R.id.btn_confirm_prices);



        btn_confirm_prices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TotalPrice = importedPerfumetotal + importedchocolateTotal+ bookTotal+ cDTotal + chocolate2Total+ importedPerfumetotal2+ perfumetotal+ pillstotal+ importedchocolate3Total;
                TotalTax = importedPerfumeTax + importedchocolateTax +cDTax + chocolate2Tax+ importedPerfumeTax2+ perfumeTax+ pillsTax+ importedchocolate3Tax;


                Toast.makeText(getContext(),"Total Price: "+ TotalPrice +"Sales Taxes: "+TotalTax,Toast.LENGTH_SHORT).show();


                 Intent intent = new Intent(getContext(), ActivityDescription.class);

                Bundle dataBundle = new Bundle();
                dataBundle.putString("totalPrice", String.valueOf(TotalPrice));
                dataBundle.putString("tax", String.valueOf(TotalTax));


                intent.putExtras(dataBundle);

                getActivity().startActivity(intent);




            }
        });

        FloatingActionButton fab = (FloatingActionButton)rootView.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                TotalPrice = importedPerfumetotal + importedchocolateTotal+ bookTotal+ cDTotal + chocolate2Total+ importedPerfumetotal2+ perfumetotal+ pillstotal+ importedchocolate3Total;
                TotalTax = importedPerfumeTax + importedchocolateTax +cDTax + chocolate2Tax+ importedPerfumeTax2+ perfumeTax+ pillsTax+ importedchocolate3Tax;


                Toast.makeText(getContext(),"Total Price: "+ TotalPrice +"Sales Taxes: "+TotalTax,Toast.LENGTH_SHORT).show();



            }
        });



        book.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getContext(),"1 book at ₹ 12.49",Toast.LENGTH_SHORT).show();




                    Double cD = Double.parseDouble(String.valueOf(12.49));
//                    Double tax = Double.parseDouble(String.valueOf(1.15));

                    bookTotal = cD;

//                    bookTax =  cD;






                }else {

                    bookTotal = Double.valueOf(0);
                    Toast.makeText(getContext(),"Minus ₹ 12.49",Toast.LENGTH_SHORT).show();


                }
            }
        });




        cD.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getContext(),"1 music CD at ₹ 14.99",Toast.LENGTH_SHORT).show();

                    Double cD = Double.parseDouble(String.valueOf(14.99));
                    Double tax = Double.parseDouble(String.valueOf(1.10));

                      cDTotal = cD*tax;

                    cDTax = cDTotal - cD;



                }else {

                    Toast.makeText(getContext(),"Minus ₹ 14.99",Toast.LENGTH_SHORT).show();

                    cDTotal = Double.valueOf(0);
                    cDTax = Double.valueOf(0);




                }
            }
        });


        chocolate.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){


                    Double cD = Double.parseDouble(String.valueOf(0.85));
                    Double tax = Double.parseDouble(String.valueOf(1.15));

                    chocolate2Total = cD*tax;
                    chocolate2Tax = chocolate2Total - cD;




                }else {

//                    chocolates = Double.parseDouble(String.valueOf(0));

                    Toast.makeText(getContext(),"Minus ₹ 0.85",Toast.LENGTH_SHORT).show();

                    chocolate2Total = Double.valueOf(0);
                    chocolate2Tax = Double.valueOf(0);




                }
            }
        });

        importedChocolate.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getContext(),"1 imported box of chocolates at ₹ 10.00",Toast.LENGTH_SHORT).show();


                    Double cD = Double.parseDouble(String.valueOf(10.00));
                    Double tax = Double.parseDouble(String.valueOf(1.05));

                    importedchocolateTotal = cD*tax;
                    importedchocolateTax = importedchocolateTotal - cD;



                }else {

                    Toast.makeText(getContext(),"Minus ₹ 10.00",Toast.LENGTH_SHORT).show();

                    importedchocolateTotal = Double.valueOf(0);
                    importedchocolateTax = Double.valueOf(0);

                }
            }
        });



        importedPerfume.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getContext(),"1 imported bottle of perfume at ₹ 47.50",Toast.LENGTH_SHORT).show();


                    Double cD = Double.parseDouble(String.valueOf(47.50));
                    Double tax = Double.parseDouble(String.valueOf(1.15));

                    importedPerfumetotal = cD*tax;

                    importedPerfumeTax = importedPerfumetotal - cD;



                }else {
                    Toast.makeText(getContext(),"Minus ₹ 47.50",Toast.LENGTH_SHORT).show();

                    importedPerfumetotal = Double.valueOf(0);
                    importedPerfumeTax = Double.valueOf(0);

                }
            }
        });


        importedPerfume2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getContext(),"1 imported bottle of perfume at ₹ 27.99",Toast.LENGTH_SHORT).show();


                    Double cD = Double.parseDouble(String.valueOf(27.99));
                    Double tax = Double.parseDouble(String.valueOf(1.15));

                    importedPerfumetotal2 = cD*tax;

                    importedPerfumeTax2 = importedPerfumetotal2 - cD;





                }else {

                    Toast.makeText(getContext(),"Minus ₹ 27.99",Toast.LENGTH_SHORT).show();

                    importedPerfumetotal2 = Double.valueOf(0);
                    importedPerfumeTax2 = Double.valueOf(0);


                }
            }
        });
//
//
        perfume.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getContext(),"1  bottle of perfume at ₹ 18.99",Toast.LENGTH_SHORT).show();

                    Double cD = Double.parseDouble(String.valueOf(18.99));
                    Double tax = Double.parseDouble(String.valueOf(1.10));

                    perfumetotal = cD*tax;

                    perfumeTax = perfumetotal - cD;


                }else {


                    Toast.makeText(getContext(),"Minus ₹ 18.99",Toast.LENGTH_SHORT).show();


                    perfumetotal = Double.valueOf(0);
                    perfumeTax = Double.valueOf(0);



                }
            }
        });
//

        pills.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getContext(),"1 packet of headache pills at ₹ 9.75",Toast.LENGTH_SHORT).show();


                    Double cD = Double.parseDouble(String.valueOf(9.75));
                    Double tax = Double.parseDouble(String.valueOf(1.05));

                    pillstotal = cD*tax;

                    pillsTax = pillstotal - cD;





                }else {


                    Toast.makeText(getContext(),"Minus ₹ 9.75",Toast.LENGTH_SHORT).show();


                    pillstotal = Double.valueOf(0);
                    pillsTax = Double.valueOf(0);



                }
            }
        });

//
        importedChocolate2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getContext(),"1 box of imported chocolates at ₹ 11.25",Toast.LENGTH_SHORT).show();


                    Double cD = Double.parseDouble(String.valueOf(11.25));
                    Double tax = Double.parseDouble(String.valueOf(1.05));

                    importedchocolate3Total = cD*tax;

                    importedchocolate3Tax = importedchocolate3Total - cD;


                }else {


                    Toast.makeText(getContext(),"Minus ₹ 11.25",Toast.LENGTH_SHORT).show();


                    importedchocolate3Total = Double.valueOf(0);
                    importedchocolate3Tax = Double.valueOf(0);



                }
            }
        });
//

        return rootView;



    }
}
