package dev.akuot.twitter_replicateandroid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterRvAdapter(var twitterList:List<Twitter>):
        RecyclerView.Adapter<TwitterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitterViewHolder {
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.twitter_list_item,parent,false)
        var twitterViewHolder =TwitterViewHolder(itemView)
        return TwitterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TwitterViewHolder, position: Int) {
        var currentTwitter=twitterList.get(position)
        holder.tvName.text=currentTwitter.name
        holder.tvHandle.text=currentTwitter.handle
        holder.tvTweet.text=currentTwitter.tweet

        holder.tvRetweetcount.text=currentTwitter.reply
//        holder.ivMessage.text=currentTwitter.like

    }

    override fun getItemCount(): Int {
        return twitterList.size
    }
}
class TwitterViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvName =itemView.findViewById<TextView>(R.id.tvName)
    var tvHandle =itemView.findViewById<TextView>(R.id.tvHandle)
    var tvTweet =itemView.findViewById<TextView>(R.id.tvTweet)
    var ivRetweet =itemView.findViewById<ImageView>(R.id.ivRetweet)
    var tvRetweetcount =itemView.findViewById<TextView>(R.id.tvRetweetcount)
    var ivMessage=itemView.findViewById<ImageView>(R.id.ivMessage)

}