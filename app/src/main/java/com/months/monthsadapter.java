package com.months;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class monthsadapter extends RecyclerView.Adapter<monthsadapter.DetailsViewHolder>
{

    String[] months =new String[12];
    Context mContext;

    public monthsadapter(Context context)
    {
        mContext = context;
    }

    @Override
    public DetailsViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        Context context = parent.getContext();
//        this is for getting the id of the layout with the data textView
        int id = R.layout.recycler_view;
//        This is for inflating of the layout
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = layoutInflater.inflate(id,parent,shouldAttachToParentImmediately);
        return new DetailsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DetailsViewHolder holder, int position)
{
    holder.month.setText(months[position]);
}

    @Override
    public int getItemCount() {
        return months.length;
    }

    public void setMonthsList(String[] newMonths)
    {
        this.months = newMonths;
//        Without it no code shows
        notifyDataSetChanged();
    }
    class DetailsViewHolder extends RecyclerView.ViewHolder
    {

        TextView month;
        public DetailsViewHolder(View itemView)
        {
            super(itemView);


            month = itemView.findViewById(R.id.month);


        }

    }



}
