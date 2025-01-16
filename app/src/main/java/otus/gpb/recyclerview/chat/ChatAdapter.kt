package otus.gpb.recyclerview.chat

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import otus.gpb.recyclerview.R

class ChatAdapter : RecyclerView.Adapter<ChatViewHolder>() {

    private var chatCard = listOf<ChatData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_chat, parent, false)
        return ChatViewHolder(view)
    }

    override fun getItemCount(): Int {
        return chatCard.size
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        val card = chatCard.getOrNull(position)

        card?.let {
            holder.bind(it)
        }
    }

    fun createCards(newCards: List<ChatData>) {
        chatCard = newCards
    }
}