package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.android.drinks.R;




public class Menu_Drinks extends Fragment {

    public Menu_Drinks() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu__drinks, container, false);

        Button squash = (Button) view.findViewById(R.id.squash);
        Button pinacolada = (Button) view.findViewById(R.id.pina);
        Button coctail = (Button) view.findViewById(R.id.coctail);
        Button lemonade = (Button) view.findViewById(R.id.lemon);
        Button russbery = (Button) view.findViewById(R.id.russ);


        squash.setOnClickListener(new View.OnClickListener() {

        public void onClick(View v) {

                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content2, new Menu1_drinks())
                        .addToBackStack(null)
                        .commit();

        }});

        pinacolada.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content2, new Menu1_drinks())
                        .addToBackStack(null)
                        .commit();
            }
        });

        coctail.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content2, new Menu1_drinks())
                        .addToBackStack(null)
                        .commit();
            }

        });

        lemonade.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content2, new Menu1_drinks())
                        .addToBackStack(null)
                        .commit();
            }
        });

        russbery.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content2, new Menu1_drinks())
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;

    }}

