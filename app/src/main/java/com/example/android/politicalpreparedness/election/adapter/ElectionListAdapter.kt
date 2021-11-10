package com.example.android.politicalpreparedness.election.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
//import com.example.android.politicalpreparedness.databinding.ViewholderElectionBinding
import com.example.android.politicalpreparedness.network.models.Election

//class ElectionListAdapter(private val clickListener: ElectionListener) :
//    ListAdapter<Election, ElectionViewHolder>(ElectionDiffCallback()) {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElectionViewHolder {
//        return ElectionViewHolder.from(parent)
//    }
//
//    //TODO: Bind ViewHolder
//    override fun onBindViewHolder(holder: ElectionViewHolder, position: Int) {
//        val election = getItem(position) as Election
//        holder.bind(election)
//    }
//
//    //TODO: Add companion object to inflate ViewHolder (from)
//    companion object DiffCallback : DiffUtil.ItemCallback<Election>() {
//        override fun areItemsTheSame(
//            oldItem: Election,
//            newItem: Election
//        ): Boolean {
//            return oldItem.id == newItem.id
//        }
//
//        override fun areContentsTheSame(
//            oldItem: Election,
//            newItem: Election
//        ): Boolean {
//            return oldItem == newItem
//        }
//    }
//
//}

//TODO: Create ElectionViewHolder
//class ElectionViewHolder(
//    private val binding: ElectionListViewBinding
//) : RecyclerView.ViewHolder(binding.root) {
//
//    fun bind(election: Election) {
//        binding.election = election
//        binding.executePendingBindings()
//    }
//
//    companion object {
//        fun from(parent: ViewGroup): ElectionViewHolder {
//            val layoutInflater = LayoutInflater.from(parent.context)
//            val binding =
//                ElectionListViewBinding.inflate(layoutInflater, parent, false)
//
//            return ElectionViewHolder(binding)
//        }
//    }
//
//}

//TODO: Create ElectionDiffCallback
class ElectionDiffCallback : DiffUtil.ItemCallback<Election>() {
    override fun areItemsTheSame(oldItem: Election, newItem: Election): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Election, newItem: Election): Boolean {
        return oldItem == newItem
    }

}

//TODO: Create ElectionListener
class ElectionListener(val clickListener: (election: Election) -> Unit) {
    fun onItemClick(election: Election) = clickListener(election)
}