package otus.gpb.recyclerview

data class Chat(
    var avatar: Int,
    var avatarActionIcon: Boolean,

    var lockIcon: Int,
    val title: String,
    var verifiedIcon: Int,

    var messageAuthor: String,

    var previewIcon: Int,
    val message: String,

    var checkIcon: Int,
    var timeService: String,

    var mentionBlock: Boolean,
    var pinnedIcon: Int,
)