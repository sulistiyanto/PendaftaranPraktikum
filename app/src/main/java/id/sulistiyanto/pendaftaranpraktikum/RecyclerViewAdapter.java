package id.sulistiyanto.pendaftaranpraktikum;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by sulistiyanto on 07/12/16.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {


    private List<Result> results;

    public RecyclerViewAdapter(List<Result> results) {
        this.results = results;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view, parent, false);
        ViewHolder holder = new ViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Result result = results.get(position);
        holder.textViewNPM.setText(result.getNpm());
        holder.textViewNama.setText(result.getNama());
        holder.textViewKelas.setText(result.getKelas());
        holder.textViewSesi.setText(result.getSesi());
    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.textNPM) TextView textViewNPM;
        @BindView(R.id.textNama) TextView textViewNama;
        @BindView(R.id.textKelas) TextView textViewKelas;
        @BindView(R.id.textSesi) TextView textViewSesi;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
