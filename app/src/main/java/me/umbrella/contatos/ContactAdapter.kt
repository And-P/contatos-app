package me.umbrella.contatos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter (val contactList:ArrayList<Contact>): RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_view, parent, false)
        return ViewHolder(view);
    }

    override fun onBindViewHolder(holder: ContactAdapter.ViewHolder, position: Int) {
        holder.bindItem(contactList[position])
    }

    override fun getItemCount(): Int {
        return contactList.size;
    }

//    Classe View Holder (Comportamento da RecycleView.ViewHolder)
    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bindItem(contact: Contact){
            val txtName = itemView.findViewById<TextView>(R.id.contact_name)
            val txtPhone = itemView.findViewById<TextView>(R.id.contact_phone)

            txtName.text = contact.name
            txtPhone.text = contact.phoneNumber
        }
    }
}