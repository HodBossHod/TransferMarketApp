package com.mycode.newapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecycleViewAdapter.OnPlayerListener {

    RecycleViewAdapter recycle_adapter;
    RecyclerView RV;
    ArrayList <TransferMarket>transferMarketList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RV=findViewById(R.id.Rec_view1);
        recycle_adapter=new RecycleViewAdapter(transferMarketList,this);
        RecyclerView.LayoutManager myLayoutManager = new LinearLayoutManager(getApplicationContext());
        RV.setLayoutManager(myLayoutManager);
        RV.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        RV.setAdapter(recycle_adapter);
        insertData();
    }
    void insertData(){
        int image=R.drawable.salah_icon;
        int c_logo=R.drawable.liv;
        int flag=R.drawable.egy;
        int icon=R.drawable.salah_run;
        String info="Mohamed Salah Hamed Mahrous Ghaly( born 15 June 1992) is an Egyptian professional footballer who plays as a forward for Premier League club Liverpool and captains the Egypt national team. Considered one of the best players in the world, he is known for his finishing, dribbling, and speed.\n" +
                "\n" +
                "Salah started his senior career in 2010 playing for Al Mokawloon, departing in 2012 to join Basel, where he won two Swiss Super League titles. In 2014, Salah joined Chelsea for a reported fee of £11 million, but limited gametime led to successive loans to Fiorentina and Roma, who later signed him permanently for €15 million. In 2017, Salah was the subject of a then-club record association football transfer when he signed for Liverpool for £36.9 million, becoming the most expensive Egyptian player of all time. There, Salah won the Premier League, the UEFA Champions League, the Premier League Golden Boot twice, and finished third for the Best FIFA Men's Player in 2018 and 2021. He also holds the record for most Premier League goals scored (32) in a 38-game season, and ranks as Liverpool's tenth-highest all-time top goalscorer. ";
        String name="Mohamed Salah";
        String value="€100.00m";
        String position="Right Winger";
        String nation="Egypt";
        String club="Liverpool";
        String age="Age:29";
        TransferMarket transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);

        image=R.drawable.messi_icon;
        c_logo=R.drawable.paris;
        flag=R.drawable.arg;
        icon=R.drawable.ankaramessi;
        info="Lionel Andrés Messi, also known as Leo Messi, is an Argentine professional footballer who plays as a forward for Ligue 1 club Paris Saint-Germain and captains the Argentina national team."
        +"Often considered the best player in the world and widely regarded as one of the greatest players of all time. Messi has won a record seven Ballon d'Or awards,a record six European Golden Shoes, and in 2020 was named to the Ballon d'Or Dream Team. Until leaving the club in 2021, he had spent his entire professional career with Barcelona, where he won a club-record 35 trophies";

        name="Lionel Messi";
        value="€60.00m";
        position="Right Winger";
        nation="Argentina";
        club="PSG";
        age="Age:34";
        transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);

        image=R.drawable.cr7;
        c_logo=R.drawable.manu;
        flag=R.drawable.port;
        icon=R.drawable.cr7_run1;
        info="Cristiano Ronaldo dos Santos Aveiro (born 5 February 1985) is a Portuguese professional footballer who plays as a forward for Premier League club Manchester United and captains the Portugal national team. Often considered the best player in the world and widely regarded as one of the greatest players of all time, Ronaldo has won five Ballon d'Or awards"
        +"and four European Golden Shoes, the most by a European player. He has won 32 trophies in his career, including seven league titles, five UEFA Champions Leagues, one UEFA European Championship and one UEFA Nations League. Ronaldo holds the records for most appearances (181), most goals (140) and assists (42) in the Champions League, most goals in the European Championship (14), most international goals by a male player (115), and most international appearances by a European male (184). He is one of the few players to have made over 1,100 professional career appearances, and has scored over 800 official senior career goals for club and country. ";
        name="Cristiano Ronaldo";
        value="€35.00m";
        position="Centre-Forward";
        nation="Portugal";
        club="Man United";
        age="Age:37";
        transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);

        image=R.drawable.lewa;
        c_logo=R.drawable.bayern;
        flag=R.drawable.pol;
        icon=R.drawable.lewa_stand;
        info="Robert Lewandowski is a Polish professional footballer who plays as a striker for Bundesliga club Bayern Munich and is the captain of the Poland national team. Recognized for his positioning, technique and finishing, Lewandowski is considered one of the best strikers of all time, as well as one of the most successful players in Bundesliga history." +
                "He has scored over 500 senior career goals for club and country. In 2020, Lewandowski won the Best FIFA Men's Player Award (retained in 2021) and the UEFA Men's Player of the Year Award.";
        name="Robert Lewandowski";
        value="€50.00m";
        position="Centre-Forward";
        nation="Poland";
        club="Bayern Munich";
        age="Age:33";
        transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);

        image=R.drawable.benz;
        c_logo=R.drawable.rma;
        flag=R.drawable.france;
        icon=R.drawable.benz_run;
        info="Karim Mostafa Benzema is a French professional footballer who plays as a striker for Spanish club Real Madrid and the France national team. A creative forward known for his playmaking and finishing," +
                "Benzema is regarded as one of the best strikers in the world.";
        name="Karim Benzema";
        value="€25.00m";
        position="Centre-Forward";
        nation="France";
        club="Real Madrid";
        age="Age:34";
        transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);

        image=R.drawable.kevin;
        c_logo=R.drawable.manc;
        flag=R.drawable.belg;
        icon=R.drawable.kevin_run;
        info="Kevin De Bruyne (born 28 June 1991) is a Belgian professional footballer who plays as a midfielder for Premier League club Manchester City and the Belgium national team. De Bruyne is widely regarded as one of the best players in the world, and has often been described as a \"complete footballer\".\n" +
                "\n" +
                "De Bruyne began his career at Genk, where he was a regular player when they won the 2010–11 Belgian Pro League. In 2012, he joined English club Chelsea, where he was used sparingly and then loaned to Werder Bremen. He signed with Wolfsburg for £18 million in 2014, where he established himself as one of the best players in the Bundesliga and was integral in the club's 2014–15 DFB-Pokal win. In the summer of 2015, De Bruyne joined Manchester City for a club record £54 million. He has since won three Premier League titles, five League Cups and an FA Cup with the club. In 2017–18, he had a significant role in Manchester City's record in becoming the only Premier League team to attain 100 points in a single season. In 2019–20, De Bruyne tied the record for most assists in a Premier League season and was awarded Player of the Season. ";
        name="Kevin De Bruyne";
        value="€100.00m";
        position="Attacking Midfield";
        nation="Belgium";
        club="Man City";
        age="Age:30";
        transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);

        image=R.drawable.haaland;
        c_logo=R.drawable.bvb;
        flag=R.drawable.nor;
        icon=R.drawable.haaland_celeb2;
        name="Erling Haaland";
        info="Erling Braut Haaland s a Norwegian professional footballer who plays as a striker for German Bundesliga club Borussia Dortmund and the Norway national team. A prolific goalscorer, Haaland is recognised for his pace, athleticism and finishing ability. He is considered one of the best strikers in world football." +
                "";
        value="€150.00m";
        position="Centre-Forward";
        nation="Norway";
        club="Dortmund";
        age="Age:21";
        transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);

        image=R.drawable.son;
        c_logo=R.drawable.spurs;
        flag=R.drawable.korea;
        icon=R.drawable.son_celeb;
        info="Son Heung-min is (born 8 July 1992) is a South Korean professional footballer who plays as a forward for the Premier League club Tottenham Hotspur and captains the South Korea national team." +
                "Widely regarded as one of the best wingers in the world, as well as one of the best Asian footballers in history, Son was the first Asian player to score more than 50 goals in the Premier League, and was nominated for the Ballon d'Or in 2019.";
        name="Heung-min Son";
        value="€85.00m";
        position="Left Winger";
        nation="South Korea";
        club="Spurs";
        age="Age:29";
        transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);

        image=R.drawable.kante;
        c_logo=R.drawable.chelsea;
        flag=R.drawable.france;
        icon=R.drawable.kante_run3;
        info="N'Golo Kanté (born 29 March 1991) is a French professional footballer who plays as a central midfielder for Premier League club Chelsea and the France national team." +
                " Considered by many to be one of the world's best midfielders, Kanté is widely praised for his work rate and defensive acumen." +
                "Kanté made his senior professional debut with Boulogne in 2012, appearing as a substitute in one Ligue 2 match, and played an entire season in the third division the following year. After that he joined Ligue 2 side Caen on a free transfer, finished third and won promotion to Ligue 1. He stayed with the club for one more year.\n" +
                "\n" +
                "In 2015, Kanté joined Leicester City for a fee worth £5.6 million and was integral to their maiden Premier League victory. The following year, he joined Chelsea for a fee worth £32 million and again won the league, making him the first outfield player to win consecutive English league titles with different clubs since Eric Cantona in 1992 and 1993" +
                "He has also won the PFA Players' Player of the Year and FWA Footballer of the Year, an FA Cup, the UEFA Europa League, and the UEFA Champions League. He was named the UEFA Men's Midfielder of the year in 2021. ";
        name="N'Golo Kanté";
        value="€55.00m";
        position="Defensive Midfield";
        nation="France";
        club="Chelsea";
        age="Age:30";
        transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);

        image=R.drawable.dona;
        c_logo=R.drawable.paris;
        flag=R.drawable.italy;
        icon=R.drawable.dona_stand;
        info="Gianluigi Donnarumma (born 25 February 1999) is an Italian professional footballer who plays as a goalkeeper for Ligue 1 club Paris Saint-Germain and the Italy national team.\n" +
                "\n" +
                "Coming through the team's youth system, Donnarumma began his career with AC Milan in 2015, becoming the second-youngest goalkeeper ever to debut in Serie A, aged 16 years and 242 days; he immediately broke into the starting line-up, earning a reputation as arguably the most promising young goalkeeper in the world at the time. In 2021, Donnarumma helped Milan secure a second place finish in the 2020–21 Serie A and qualification for the 2021–22 UEFA Champions League after an eight-year absence. He was also named Serie A's Best Goalkeeper of the Year, IFFHS World's Best Goalkeeper and also won the Yashin Trophy. After six years with Milan, Donnarumma moved to Ligue 1 side Paris Saint-Germain in June 2021 on a free transfer.\n" +
                "\n" +
                "Internationally, Donnarumma broke the record as the youngest Italy under-21 player ever to play, aged 17 years and 28 days in March 2016. Six months later, he made his senior international debut, becoming the youngest goalkeeper ever to appear for Italy, aged 17 years and 189 days. Donnarumma represented Italy at UEFA Euro 2020, helping the team win the tournament and winning the Player of the Tournament award.";
        name="Gianluigi Donnarumma";
        value="€65.00m";
        position="Goalkeeper";
        nation="Italy";
        club="PSG";
        age="Age:22";
        transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);
    }

    @Override
    public void OnPlayerClick(int position) {
        TransferMarket t;
        t=transferMarketList.get(position);
        HomeActivity.image=t.getIcon();
        HomeActivity2.s=t.getInfo();
        Intent intent=new Intent(this,TabbedPlayerActivity.class);
        startActivity(intent);


    }
}