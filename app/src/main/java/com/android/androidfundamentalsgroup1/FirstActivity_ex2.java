package com.android.androidfundamentalsgroup1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity_ex2 extends AppCompatActivity {
    public static final String TEXT_MESSAGE_KEY = "textMessageKey";

    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_ex2);

        buttonOne = findViewById(R.id.button_text_one);
        buttonTwo = findViewById(R.id.button_text_two);
        buttonThree = findViewById(R.id.button_text_three);
    }

    public void buttonOneOpenSecondActivity(View view) {
        Intent intent = new Intent(FirstActivity_ex2.this, SecondActivity_ex2.class);
        String text = "I clicked the first button!\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc tempus bibendum lectus, ut finibus velit scelerisque in. Vestibulum gravida facilisis magna sit amet porttitor. Integer hendrerit nunc vitae ipsum pellentesque, a condimentum turpis euismod. Nulla facilisi. In quis magna id arcu bibendum bibendum. Nunc tristique volutpat metus at faucibus. Maecenas tincidunt a risus nec molestie. Donec ut mauris nulla. Nunc interdum orci ipsum, eu sodales nisl convallis in. Donec non elit suscipit, lobortis enim id, congue orci.\n" +
                "\n" +
                "Praesent molestie interdum pulvinar. Phasellus placerat enim ut dapibus dictum. Donec convallis elementum tristique. Duis non pulvinar massa. Integer faucibus suscipit finibus. Cras dapibus erat feugiat ante ultrices porttitor. Pellentesque eu purus faucibus, placerat mi ac, maximus velit. Aenean finibus suscipit eros, a sagittis purus cursus eget. Phasellus ut odio sagittis, bibendum velit quis, scelerisque turpis.\n" +
                "\n" +
                "Cras feugiat non ligula non consequat. Donec porttitor felis euismod, maximus nisl in, convallis ante. Praesent gravida erat risus, quis convallis sem rutrum eget. Proin vel bibendum sapien, eget mollis nibh. Sed sed viverra ante. Sed lobortis quam et dolor commodo varius. Maecenas eget elit non leo congue aliquam. Sed magna justo, elementum eu vestibulum at, iaculis a risus. In viverra posuere massa, convallis commodo massa varius quis. Phasellus tortor massa, blandit in interdum eget, auctor at tellus. Quisque sollicitudin eleifend viverra. Curabitur finibus tincidunt semper.\n" +
                "\n" +
                "Maecenas et nisi leo. Nullam lobortis feugiat nibh, sed pretium lacus imperdiet non. Duis nec purus ut enim suscipit cursus non quis est. Praesent nec dapibus urna. Nullam eleifend enim nulla, nec mattis massa accumsan at. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam at condimentum turpis. In a venenatis lorem. Nunc ornare eros et accumsan auctor. Phasellus hendrerit gravida mi in elementum. Donec a mauris eget tellus mollis pulvinar et ac dolor. Proin tincidunt ligula at aliquam pharetra. Integer a nisi id urna imperdiet dictum. Nulla facilisi.\n" +
                "\n" +
                "Nam feugiat lacinia lobortis. Sed non hendrerit sem. Ut quis risus eleifend, condimentum sapien id, dictum diam. Vestibulum efficitur ornare tortor non rutrum. Fusce quis tortor sollicitudin, commodo purus et, lobortis sem. Nulla et nisi magna. Ut non dictum neque. Proin nec quam arcu. Suspendisse potenti. Proin placerat turpis ac tristique viverra. Nullam feugiat, augue ut facilisis facilisis, odio elit convallis justo, id condimentum magna lorem non felis.";
        intent.putExtra(TEXT_MESSAGE_KEY, text);
        startActivity(intent);
    }

    public void buttonTwoOpenSecondActivity(View view) {
        Intent intent = new Intent(FirstActivity_ex2.this, SecondActivity_ex2.class);
        String text = "I clicked the second button!\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc tortor dui, tempus eu fermentum eget, maximus eu nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Mauris facilisis sodales libero, non gravida mi tempor nec. Nam dolor arcu, mattis a placerat id, iaculis sit amet nulla. Sed hendrerit risus arcu, ut pharetra diam vestibulum quis. Etiam eu faucibus ligula, ut luctus nunc. Aenean dolor elit, auctor eget metus a, vestibulum finibus purus. Proin pharetra varius elit in scelerisque. Cras non egestas sem. Nam quis ligula mauris. Quisque eros eros, dapibus vel ultricies rhoncus, blandit ac libero. Donec non nisi massa. Nulla semper sollicitudin quam, ut viverra nisl molestie vitae. Mauris mattis lacus vel nisl condimentum, non dapibus sapien condimentum.\n" +
                "\n" +
                "Cras tempus ac ipsum a consectetur. Mauris dictum ipsum id fermentum pellentesque. Donec volutpat, neque nec aliquam molestie, augue purus lobortis magna, vel placerat neque metus eu lacus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec consequat imperdiet nisl in feugiat. Pellentesque mattis tortor metus, quis tincidunt arcu pellentesque nec. Donec ultrices mi in velit congue elementum. Aenean interdum, leo nec faucibus egestas, tortor purus scelerisque sem, ac finibus odio risus nec nisl. Nulla at augue fringilla, pellentesque sem id, consequat ante. Donec metus lorem, gravida in lacus at, lobortis aliquet sapien. Donec scelerisque quis ipsum nec pretium. Curabitur et dictum eros.\n" +
                "\n" +
                "Aliquam at nibh non elit facilisis consectetur. Donec leo est, egestas id tristique eget, lacinia a nunc. Etiam ligula leo, rutrum quis sapien eu, bibendum rhoncus quam. Maecenas accumsan fermentum risus, id molestie nisi convallis quis. Donec placerat pharetra iaculis. Cras id metus convallis, laoreet ligula quis, semper risus. Nam eget ante et libero egestas fermentum et ac nunc. Pellentesque sit amet lacinia risus. Nulla arcu ligula, interdum ut nibh congue, blandit pretium ante. Sed vitae efficitur leo, at consectetur dui.\n" +
                "\n" +
                "Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Donec pellentesque est lacus, ut faucibus arcu egestas eu. Vestibulum mollis, libero sit amet pulvinar vulputate, nisl ligula aliquet purus, in facilisis purus massa et turpis. Proin nisi elit, efficitur et dictum nec, tristique et sem. Nullam elementum, diam eu malesuada porttitor, elit diam dapibus leo, ac sagittis arcu ipsum et nulla. Sed ornare a purus eget ullamcorper. Donec ullamcorper urna id quam congue, in faucibus diam finibus.\n" +
                "\n" +
                "Pellentesque vestibulum risus urna, non consectetur sapien auctor sed. Duis euismod massa sit amet suscipit suscipit. Sed laoreet sit amet nibh a faucibus. Curabitur libero purus, mattis nec dapibus eget, aliquet a urna. Donec eu laoreet tortor. Mauris eros lorem, eleifend sed vestibulum vitae, tincidunt eu ante. Nullam et fermentum urna. Cras sit amet ante ut nisl laoreet dapibus. Nam quam tortor, eleifend sed est quis, consectetur bibendum mi.";
        intent.putExtra(TEXT_MESSAGE_KEY, text);
        startActivity(intent);
    }

    public void buttonThreeOpenSecondActivity(View view) {
        Intent intent = new Intent(FirstActivity_ex2.this, SecondActivity_ex2.class);
        String text = "I clicked the third button!\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Donec vel lectus vel libero pharetra elementum tincidunt hendrerit ex. Nulla eleifend viverra ex vel dapibus. Fusce ac pellentesque velit, ut pretium libero. Nulla facilisi. Nullam nisi leo, molestie accumsan hendrerit sed, pellentesque id arcu. Pellentesque eget lorem eu augue pulvinar porta at eget purus. Integer a ipsum hendrerit, facilisis urna sed, malesuada nisi. Quisque luctus mi a magna accumsan, at blandit dui iaculis. Donec eu vulputate orci.\n" +
                "\n" +
                "Donec hendrerit scelerisque ipsum, sit amet fringilla leo tempor id. Curabitur porttitor erat sit amet felis semper tempor. Ut porta metus sapien, ut convallis ipsum porttitor a. Aenean gravida quam lobortis, faucibus sapien sed, porttitor nulla. Nam sed enim vel purus vulputate vulputate. Nunc luctus vel dui nec auctor. Aliquam interdum mattis nunc, vel elementum ex accumsan eget. Nulla vehicula odio vel hendrerit venenatis. Duis vitae facilisis tellus, a laoreet tortor. Phasellus ultrices volutpat metus pulvinar consectetur.\n" +
                "\n" +
                "Nulla facilisi. Vivamus lacinia et neque id congue. Morbi quis ligula sit amet quam mollis iaculis eget ut quam. Integer quis fermentum augue. Curabitur aliquet blandit arcu. Nulla dignissim convallis mi eget tincidunt. Nam pellentesque lorem non velit vulputate mattis. Cras in lacus egestas eros rhoncus aliquet. Nam in nunc varius, consequat leo sit amet, finibus lectus. Integer nec vestibulum quam, nec imperdiet ligula. Maecenas at placerat diam. Fusce ornare tempus risus, eget efficitur nulla finibus nec. In malesuada laoreet quam, id porta dui ornare tincidunt. Sed porttitor erat sed est rhoncus sagittis.\n" +
                "\n" +
                "Aliquam rutrum dolor diam, mattis scelerisque enim interdum ac. Aliquam faucibus dolor quis nisi consectetur ornare. Nunc convallis ornare mollis. Nam ornare sollicitudin scelerisque. Nulla risus sem, fringilla sed sollicitudin nec, bibendum vel tellus. Nam massa lectus, vehicula vel lectus at, ultricies elementum justo. Sed tristique, quam ac finibus feugiat, neque erat ultrices felis, vel sodales justo nunc ut sem. Phasellus velit velit, ullamcorper sit amet diam id, eleifend lobortis mi. Nam risus dui, aliquet venenatis mi at, volutpat facilisis nisl. Pellentesque sit amet tincidunt nisl. Duis tincidunt lacus sit amet tortor sagittis, id sollicitudin sapien efficitur. Morbi nec pellentesque nisi. Nam facilisis pharetra velit at bibendum. Nullam eros lectus, sollicitudin vitae nisl sed, venenatis ultricies ipsum. Maecenas tellus risus, vestibulum molestie suscipit vel, laoreet in velit. Aenean vel ligula orci.\n" +
                "\n" +
                "Fusce non facilisis purus. Maecenas at felis molestie, dictum est ut, imperdiet augue. In condimentum id lectus a tincidunt. Vivamus sollicitudin turpis sit amet volutpat dictum. Nulla varius sollicitudin mauris, eget tempor urna interdum vitae. Cras rhoncus quis massa a eleifend. Ut congue, est cursus vulputate pharetra, sem massa gravida eros, nec convallis dui libero sit amet nisl. Praesent gravida bibendum egestas. Maecenas vel tempus sem. Suspendisse aliquam ante id sollicitudin posuere. Ut sit amet purus non est dignissim finibus sed porta nisi. Pellentesque viverra consectetur finibus.";
        intent.putExtra(TEXT_MESSAGE_KEY, text);
        startActivity(intent);
    }

}