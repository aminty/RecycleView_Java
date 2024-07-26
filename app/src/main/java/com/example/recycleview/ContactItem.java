package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactItem extends RecyclerView.Adapter<ContactItem.ContactViewHolder> {


    String[] nameArray ={"Amin","Ali","Reza","Akbar","Hossein","Fatemeh"};

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_item, parent, false);
        return new ContactViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
            holder.onBindContact(nameArray[position]);
    }

    @Override
    public int getItemCount() {
        return nameArray.length;
    }

    public class  ContactViewHolder extends RecyclerView.ViewHolder{
            private TextView firstChar;
            private TextView fullName;

          public ContactViewHolder(@NonNull View itemView) {
              super(itemView);
              firstChar=itemView.findViewById(R.id.first_char_tv);
              fullName=itemView.findViewById(R.id.fullname_tv);
          }

          public void onBindContact(String fullName){
              this.fullName.setText(fullName);
              this.firstChar.setText(fullName.substring(0,1));

          }


      }
}
