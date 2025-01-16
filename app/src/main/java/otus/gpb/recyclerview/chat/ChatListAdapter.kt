package otus.gpb.recyclerview.chat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import otus.gpb.recyclerview.R


class ChatListAdapter : ListAdapter<ChatData, ChatViewHolder>(ChatDiffutils()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_chat, parent, false)
        return ChatViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    fun deleteChatCard(position: Int) {
        val newChatList = currentList.filterIndexed { index, chatData -> index != position }
        this.submitList(newChatList)
    }
}