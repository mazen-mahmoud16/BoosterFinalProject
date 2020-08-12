
class Friend : AppCompatActivity() {
    private val viewModel: FriendViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friend)
        //FriendAdapter(this, viewModel.getTokenData())


    }
}