package otus.gpb.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import otus.gpb.recyclerview.chat.ChatAdapter
import otus.gpb.recyclerview.chat.ChatData

class MainActivity : AppCompatActivity() {

    private val chatAdapter: ChatAdapter by lazy { ChatAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardsMessages = findViewById<RecyclerView>(R.id.cardsMessages)
        cardsMessages.adapter = chatAdapter
        chatAdapter.createCards(createChatCards())
    }

    private fun createChatCards(): List<ChatData> {
        val cards = (1..15).map {
            ChatData(
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
        }.toList()
        return cards
    }
}