package com.example.recyclerviewpractice;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    PersonAdapater personAdapater;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        personAdapater= new PersonAdapater(getPersonList());


        recyclerView= findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(personAdapater);

    }
    private List<Person>getPersonList() {


        List<Person> people = new ArrayList<>();
        Person person = new Person("Denzel Washington","phone","imageurl");
        Person person1 = new Person("Chadwick Boseman","","");
        Person person2 = new Person("Lewis Hamilton","","");
        Person person3 = new Person("3","Phone","");
        Person person4 = new Person("Samantha Jenkins","","");
        Person person5 = new Person("Samantha Jenkins","","");
        Person person6 = new Person("Samantha Jenkins","","");
        Person person7 = new Person("Samantha Jenkins","","");
        Person person8 = new Person("Samantha Jenkins","","");
        Person person9 = new Person("Samantha Jenkins","","");
        Person person10 = new Person("Samantha Jenkins","","");

        people.add(person);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);

        return people;

    }

}
