package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ThreeButtonsActivity2 extends AppCompatActivity {

    List<String> paragraphs;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_buttons2);

        textView = findViewById(R.id.textView_paragraph);
        paragraphs = new ArrayList<String>();

        paragraphs.add("— Sănătate și voie bună de la Lică Sămădăul! zise el îndrăzneț. Ți-a lăsat vorbă să ne dai să mâncăm și să bem; au să vie și celelalte turme în urmă și ne-a spus ca să-ți lăsăm cinci grăsuni din turmă și să ți-i alegi după plac.\n" +
                "\n" +
                "— Bine plătește Lică! zise unul din drumeți.\n" +
                "— Are de unde! adause altul.\n" +
                "— Mai știi!? întâmpină al treilea. Are turme multe, și porcarii beau și mănâncă mult.\n" +
                "\n" +
                "Ghiță-și încreți fruntea. Vorbele boitarului și apoi vorbele drumeților erau parcă să-l scoată din sărite. El simțea că, dacă nu primește, se trage în degete cu Lică; dar aici, față cu oamenii, nu putea să primească.\n" +
                "\n" +
                "— Bine, zise el, călcându-și pe inimă. Lăsați, că mă înțeleg eu cu Lică. Mâncați numai și beți; grija mea de plată.\n" +
                "\n" +
                "Băietanul ieși, iar Ghiță se întoarse spre oameni și mai adause:\n" +
                "— Ce știu eu cât vor fi mâncând oamenii lui? Eu vreau să am socoteală curată.\n" +
                "\n" +
                "— Așa-i! ziseră oamenii.\n" +
                "— Bine, Ghiță, de ce n-ai primit grăsunii? întrebă în urmă bătrâna.\n" +
                "— Ce să fac eu cu grăsunii lui? răspunse el cam necăjit.\n" +
                "— Să-i tai, să-i vinzi, să-i îngrași. Ghiță, ia grăsunii, că rămâi fără bani. Dac-ar avea omul bani gata, n-ar plăti în grăsuni. Trebuie să primești ce-ți dau oamenii, fiindcă nimeni nu-ți poate da ceea ce nu are. Omul e cinstit și te plătește cinstit: de ce să-l superi fără nici un folos? Acum îți dă, acum ia, căci nu știi ce are să fie mâine.\n" +
                "\n" +
                "— Lasă, că mai vin și alte turme... grăi Ghiță cam cu jumătate de gură. Să mă mai gândesc, să mai văd ce cheltuială fac oamenii.\n" +
                "\n" +
                "— Gând bun să-ți dea Dumnezeu!\n" +
                "\n" +
                "Nici Ghiță n-ar fi cerut decât un gând bun de la Dumnezeu, dar îi era greu să se oprească asupra unui gând, fie el bun, fie rău.\n" +
                "\n" +
                "Turmele treceau una câte una pe dinaintea cârciumii; când una se vedea din depărtare, cealaltă pornea mai departe, și locul se deșerta, dar peste puțin iar se umplea. Și cum turmele plecau una câte una, Ghiță întreba mereu câte mai sunt, și pe cât numărul turmelor rămase în urmă scădea, pe atât el prindea poftă de a-și opri cei cinci grăsuni.\n" +
                "\n" +
                "— A zis Lică să-mi opresc cinci grăsuni, îi zise în cele din urmă unuia dintre porcari.\n" +
                "\n" +
                "— Noi nu știm nimic, răspunse acesta.\n" +
                "— Apoi, adause altul cam în glumă, noi plătim înainte, ori nu plătim deloc.\n" +
                "\n" +
                "Peste puțin sosi și Lică, ceru un pahar de vin, își întrebă de turme, apoi zise \"noroc bun!\" și plecă mai departe fără să fi descălecat măcar.\n" +
                "\n" +
                "Ghiță rămase cuprins de gândurile omului păgubaș. El era om cu minte și înțelegea cele ce se petrec. Aci, la Moara cu noroc, nu putea să stea nimeni fără voia lui Lică: afară de arândaș și afară de stăpânire mai era și dânsul care stăpânea drumurile, și în zadar te înțelegi cu arândașul, în zadar te pui bine cu stăpânirea, căci, pentru ca să poți sta la Moara cu noroc, mai trebuie să te faci și om al lui Lică. ");

        paragraphs.add("Iar Ghiță voia cu tot dinadinsul să rămâie la Moara cu noroc, pentru că-i mergea bine.\n" +
                "\n" +
                "\"Trei ani, numai trei ani să pot sta aici, își zicea el, să mă pun în picioare, încât să pot să lucrez cu zece calfe și să le dau altora de cârpit.\"\n" +
                "\n" +
                "Dar acești trei ani atârnau de Lică. Dacă se punea bine cu dânsul, putea să-i meargă de minune, căci oamenii ca Lică sunt darnici. E numai vorba ce va fi cerând Lică pentru ceea ce dă.\n" +
                "\n" +
                "Ghiță întâia oară în viața lui ar fi voit să n-aibă nevastă și copii, pentru ca să poată zice: \"Prea puțin îmi pasă!\" Se gândea la câștigul pe care l-ar putea face în tovărășie cu Lică, vedea banii grămadă înaintea sa și i se împăienjeneau parcă ochii: de dragul acestui câștig ar fi fost gata să-și pună pe un an, doi capul în primejdie. Avea însă nevastă și copii și nu putea să facă ce-i plăcea.\n" +
                "\n" +
                "\"Să vedem! își zise el în cele din urmă, voind să-și alunge gândurile rele. Deocamdată, e mai bine ca el să-mi fie dator mie.\"\n" +
                "\n" +
                "Așa zicea el, însă de cu seară, când își strânse banii ca să-i pună în ladă, el simți că nu are dreptate.\n" +
                "\n" +
                "Ghiță nu era omul care se știe bucuros dator, dar cu atât mai puțin omul care dă bucuros de la sine, și așa îi venea parcă să zică: \"Am să mă pun frumos pe lângă dânsul, ca să-mi plătească\".\n" +
                "\n" +
                "Era legat, și omul când se simte legat e supărăcios. Chiar atunci seara Ghiță își bătu sluga, pe ungurul, fără a-și da seama pentru ce, iar când Ana îl mustră, fără de voie, pentru aceasta, el îi aruncă vorbele:\n" +
                "\n" +
                "— Ei! frate, dă-mi pace! Parcă nu tot pentru voi îmi mistuiesc viața!? Ana tăcu, dar ochii i se umplură de lacrimi, fiindcă vorbele îi păreau grele.\n" +
                "\n" +
                "— Ei! și tu te mâhnești numaidecât, zise el amărât. Ar fi voit să meargă la ea, să-i ceară iertare, și să o împace, dar nu putea; era în el ceva ce nu-l lăsa, și așa ieși afară, ca să fie singur cu gândurile sale.\n" +
                "\n" +
                "Și dacă ar fi știut Ana ce gândea și ce simțea el, când stătea așa singur și posomorât, ea s-ar fi dus la el și l-ar fi mângâiat, dar el tăcea, și așa ea nu îndrăznea să-l supere, ci se întreba mereu ce o fi având soțul ei.\n" +
                "\n" +
                "Duminică, după ce bătrâna plecase la biserică, Ghiță-și răsuflă veninul asupra lui Laie, apoi se făcuse mai vesel decât de obicei. El petrecea cu Ana și cu copiii în umbra arinilor, luase de zgardă pe Cula, câinele cel mare și leneș, își pusese băiatul pe el și-l învăța să călărească, și-l învăța mereu, cu toate că Ana se necăjea, temându-se ca nu cumva copilul să cadă ori câinele să-l muște.\n" +
                "\n" +
                "Deodată, ceilalți câini, care erau slobozi, începură să latre, iar Cula, auzind lătratul lor, se repezi și el lătrând în partea despre deal, încotro îi auzea pe dânșii lătrând.\n" +
                "\n" +
                "Ana țipă înspăimântată, deoarece copilul era să cadă; însă Ghiță nici nu ținu seama de dânsa, ci, strângând zgarda, se îndreptă și privi îngrijat în toate părțile.\n" +
                "\n" +
                "Nu zări nimic.\n" +
                "— Se vede c-au dat de cățelul-pământului, ori au simțit vreo vulpe prin împrejur, zise el, lăsându-i să latre mai departe.\n" +
                "\n" +
                "— Ghiță! grăi Ana jeluindu-se. Eu nu știu cum te-ai făcut tu de la o bucată de vreme: vezi că-mi vine rău când văd copilul pe câine, și parcă în ciuda mea îl ții mereu.\n" +
                "\n" +
                "— Săracul de mine! răspunse el cam răstit. Când e vorba să-mi fac și eu o poftă, proastă, bună, cum ar fi, țop! că mi se supără nevasta! Haid'! adause apoi, luând copilul în brațe și dând cu piciorul în câine.\n" +
                "\n" +
                "— Nu, Ghiță! Nu vreau! strigă Ana speriată, apoi fugi după câine, îl luă de zgardă, îl aduse la locul unde fusese și începu să-l roage pe Ghiță cu stăruință ca să-și pună iar băiatul călare pe el.\n" +
                "\n" +
                "— Uite, era o prostie! grăi Ghiță muiat și se lăsă pe iarbă. Ana luă ea însăși copilul, îl puse călare pe Cula și-l purtă fricoasă la dreapta și la stânga, privind mereu la soțul său, ca să vadă dacă el nu zâmbește.\n" +
                "\n" +
                "Ghiță nu zâmbea. Privind la copilul ce țipa răsfățat și privind la soția sa, îl apucă o înduioșare din ce în ce mai adâncă: îi era parcă n-a văzut-o de mult și parcă era să se despartă de dânsa.\n" +
                "\n" +
                "— Ano, zise el în cele din urmă alene, ia vino, șezi lângă mine! După ce ea se așeză lângă dânsul, el o privi lung și întristat, îi netezi părul de pe frunte, apoi grăi încet:\n" +
                "\n" +
                "— Ce zici tu! n-ar fi bine să plecăm noi la Sf. Dimitrie de aici?\n" +
                "— Pentru ce? întrebă nevasta uimită.\n" +
                "— Nu ți se urăște ție în singurătatea asta?\n" +
                "— Mie? nu!\n" +
                "— Nu ți-e frică?\n" +
                "— De ce? ");

        paragraphs.add("— De ce? De toate! Tu auzi cum latră câinii; au dat de vreo urmă, de vreun gândac, de vreun vierme și latră, fiindcă n-au altă treabă: mie însă mi se răcește măduva în oase când îi aud lătrând. E grozavă viața asta, Ano, e grozavă; stai aici în pustietate, și te sperii de nimic, și-ți mistuiești viața cu năluciri deșerte.\n" +
                "\n" +
                "— Ce ai, Ghiță? strigă nevasta cuprinsă de îngrijare.\n" +
                "— Ce am? răspunse el cu amărăciune. Am o nenorocire; pierd ziua de astăzi pentru cea de mâine. Eu nu ți-am vorbit niciodată despre lucruri de aceste, dar trebuie să fii și tu om, Ano, și să te gândești la viață, căci nu pot să-ți vie mereu toate de-a gata. Astăzi stau aici și nu mă supără nimic, dar îmi fac eu însumi gânduri rele despre ziua de mâine, și aceste gânduri nu-mi lasă tihnă să mă bucur de ziua de astăzi. Și poate că gândurile mele sunt deșerte, poate că ziua de mâine are să fie tot bună, dar o voi pierde temându-mă de cea de poimâine. Și cât vom sta aici, nu mai scap de nevoia aceasta.\n" +
                "\n" +
                "— Atunci să plecăm, Ghiță.\n" +
                "— Da, să plecăm, dar întreabă-mă dacă mă pot hotărî să plec. Vezi tu, așa cum sunt, îmi vine greu să plec.\n" +
                "\n" +
                "— Atunci să rămânem aici. Tu știi mai bine cum are să fie bine.\n" +
                "— Poate că știu, Ano, dar nu pot, zise el cu amărăciune. Ar trebui să mă silească cineva, să mă împingă. Mi-e greu să-i vorbesc maichii, pentru că ea ne-a zis să nu venim aici; mi-e rușine; iară tu ești bună, Ano, și blândă, dar ești ușoară la minte și nu înțelegi nimic: sunt cu tine ca fără de tine; în loc de a-mi alunga gândurile cele rele, mă lași să mă mistuiesc cu ele, și când nu mai știu ce să fac, tu te uiți la mine cu milă, și atâta tot.\n" +
                "\n" +
                "— Ce să fac, zise ea mâhnită, dacă așa m-a lăsat Dumnezeu!? Ghiță se lăsă pe coate și rămase așa întins pe pământ și cu privirea pierdută în depărtare.\n" +
                "\n" +
                "Într-un târziu, Ana își ridică capul și privi îndrăzneață la el.\n" +
                "— Fiindcă tu le fierbi toate în tine și mie nu-mi spui nimic, zise ea. Apoi tot eu sunt de vină dacă nu știu ce te pune pe gânduri... ");

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            int index = bundle.getInt("index");
            textView.setText(paragraphs.get(index));
        }
    }
}