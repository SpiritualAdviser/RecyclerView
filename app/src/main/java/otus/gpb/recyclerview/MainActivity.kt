package otus.gpb.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import otus.gpb.recyclerview.chat.ChatData
import otus.gpb.recyclerview.chat.ChatListAdapter
import otus.gpb.recyclerview.chat.ChatTouchHelper

class MainActivity : AppCompatActivity() {

    private val chatAdapter: ChatListAdapter by lazy { ChatListAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createRcViewChat()
    }

    private fun createRcViewChat() {
        val cardsMessages = findViewById<RecyclerView>(R.id.cardsMessages)
        cardsMessages.adapter = chatAdapter
        chatAdapter.submitList(createChatCards())

        cardsMessages.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        ItemTouchHelper(ChatTouchHelper(chatAdapter)).attachToRecyclerView(cardsMessages)
    }

    private fun createChatCards(): List<ChatData> {
        val cards = (1..15).map {

            ChatData(
                id =it,
                avatar = R.drawable.avatar_1,
                avatarActionIcon = R.drawable.avatar_action_icon,
                lockIcon = R.drawable.lock_icon,
                title = "Title",
                verifiedIcon = R.drawable.verified_icon,
                messageAuthor = "messageAuthor",
                previewIcon = R.drawable.preview_1,
                message = "message",
                checkIcon = R.drawable.check_icon,
                timeService = "11:00",
                mentionBlock = true,
                pinnedIcon = R.drawable.pinned_icon
            )
        }.toMutableList()
        return cards
    }
}