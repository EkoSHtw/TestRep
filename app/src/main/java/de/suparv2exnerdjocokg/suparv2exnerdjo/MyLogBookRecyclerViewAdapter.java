package de.suparv2exnerdjocokg.suparv2exnerdjo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import de.suparv2exnerdjocokg.suparv2exnerdjo.Todo.Note;

/**

 * TODO: Replace the implementation with code for your data type.
 */
public class MyLogBookRecyclerViewAdapter extends RecyclerView.Adapter<MyLogBookRecyclerViewAdapter.LogBookItemHolder> implements Filterable {

    private List<Note> mValues;
    private List<Note> filteredData;
    private Filter mFilter;
//    private final OnListFragmentInteractionListener mListener;

    Context context;

//    public MyLogBookRecyclerViewAdapter(List<Note> items, OnListFragmentInteractionListener listener) {
//        mValues = items;
//        mListener = listener;
//    }

    public MyLogBookRecyclerViewAdapter(List<Note> notes) {
        initializeList(notes);
        mFilter = new ItemFilter();
    }

    public MyLogBookRecyclerViewAdapter(Context context, List<Note> values) {
        super();
        this.context = context;
        initializeList(values);
    }

    private void initializeList(List<Note> values) {
        this.mValues = values;
        this.filteredData = values;
    }


    @Override
    public void onBindViewHolder(final LogBookItemHolder holder, int position) {
        Note note = mValues.get(position);
        holder.date.setText(note.getTimestamp().toString());
        holder.tag.setText(note.getTag());
        holder.carer.setText(note.getCarer().getName());
        holder.content.setText(note.getContent());

//        holder.mView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (null != mListener) {
//                    // Notify the active callbacks interface (the activity, if the
//                    // fragment is attached to one) that an item has been selected.
//                    mListener.onListFragmentInteraction(holder.mItem);
//                }
//            }
//        });
    }

    @Override
    public LogBookItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_logbook_item, parent, false);
        return new LogBookItemHolder(view);
    }
    //TODO
//    public View getView(){
//        return new View(context);
//    }


    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public Note getItem(int pos) {
        return this.mValues.get(pos);
    }

    @Override
    public Filter getFilter() {
        if (this.mFilter == null) {
            this.mFilter = new ItemFilter();
        }
        return this.mFilter;
    }

    private class ItemFilter extends Filter {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            Log.println(Log.INFO, "m", "Hi ich bin der Filter");

            String filterString = constraint.toString().toLowerCase();

            FilterResults results = new FilterResults();

            final List<Note> list = mValues;

            int count = list.size();
            final ArrayList<Note> nlist = new ArrayList<Note>(count);

            String filterableString;
            Note filterNote;
            for (int i = 0; i < count; i++) {
                filterNote = list.get(i);
                filterableString = filterNote.getTag();
                if (filterableString.toLowerCase().contains(filterString)) {
                    nlist.add(filterNote);
                }
            }

            results.values = nlist;
            results.count = nlist.size();

            return results;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            filteredData = (ArrayList<Note>) results.values;
            notifyDataSetChanged();
        }
    }

    public class LogBookItemHolder extends RecyclerView.ViewHolder {
        public final TextView date;
        public final TextView tag;
        public final TextView content;
        public final TextView carer;

        public LogBookItemHolder(View view) {
            super(view);
            date = (TextView) view.findViewById(R.id.frag_logB_date);
            tag = (TextView) view.findViewById(R.id.frag_logB_tag);
            content = (TextView) view.findViewById(R.id.frag_logB_content);
            carer = (TextView) view.findViewById(R.id.frag_logB_carer);
        }
    }
}