package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.drinks.R;

import java.text.NumberFormat;

/**
 * A simple {@link Fragment} subclass.
 */
public class Menu1_drinks extends Fragment {
    int quantity = 0;

    public Menu1_drinks() {
        // Required empty public constructor
    }


    View view;
    TextView qv1,pv1;
    Button b1,b2,b3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_menu1_drinks, container, false);

        return  view;}

    @Override
    public void onStart() {
        super.onStart();

        b1 = (Button) view.findViewById(R.id.ic);
        b2 = (Button) view.findViewById(R.id.dc);
        b3 = (Button) view.findViewById(R.id.or);
        qv1 = (TextView) view.findViewById(R.id.qv);
        pv1 = (TextView) view.findViewById(R.id.pv);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View args) {

                quantity = quantity + 1;
                display(quantity);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
    public void onClick(View V) {

        quantity = quantity - 1;

        display(quantity);
    }});


    b3.setOnClickListener(new View.OnClickListener() {
    public void onClick(View V) {
        display(quantity);
        displayPrice(quantity * 5);
        Toast.makeText(getActivity(), "OrderPlaced!Serve it will be in 5 minutes", Toast.LENGTH_SHORT).show();

    } }); }
    public void display(int number){

        qv1.setText(""+number);}

    public void displayPrice(int number) {
        pv1.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    }
