package character;

import actions.Dialogue;
import actions.Drawable;
import actions.Poet;
import actions.Portrait;
import control.Time;
import enumeration.Colors;
import enumeration.HowComparison;
import enumeration.HowGood;
import enumeration.HowSpeed;
import enumeration.Thickness;

import static enumeration.Colors.*;

public class Neznaika extends Korotishki implements Drawable, Dialogue, Poet {
    String had;
    String hadThink;
    /**
     * constructor
     *
     * @brief sets the parameters
     */
    public Neznaika() {
        super("Neznaika");
        this.thinks = new String[]{""};
        this.famous= HowComparison.VERY;
        this.clothes= new String[]{"bright blue hat", "yellow canary pants", "orange shirt", "green tie"};
    }

    String famos="In particular, Neznaika became famous after one of history.";

    /**
     * became famous
     * @return word
     */
    public String becameFamous(){
        String word=this.famos;
        System.out.println(word);
        return word;
    }

    /**
     * void annoy
     * reduces Gunka's mood
     *
     * @param gunka
     */
    public void annoy(Gunka gunka) {
        gunka.mood -= 10;
    }

    /**
     * hang up
     * @param portrait
     * @param place
     * @returnnword
     */
    public String hangUp(Portrait portrait, String place){
        String word=this.name+" hang up portrait "+portrait.name+" on "+place;
        System.out.println(word);
        return word;
    }

    /**
     * subscribe
     * @param portrait
     * @return word
     */
    public Portrait subscribe(Portrait portrait){
        portrait.subscribe=portrait.name;
        return portrait;
    }

    /**
     * play tube
     * @param place
     * @return word
     */
    public String playTube(String place){
        String word=this.name+" play "+place;
        System.out.println(word);
        return word;
    }

    /**
     * go outsise
     * @return word
     */
    public String goOutside(){
        String word=this.name+" go out";
        System.out.println(word);
        return word;
    }

    /**
     * jaelous
     * @param korotishka
     * @return word
     */
    public String jealous(Korotishki korotishka){
        this.mood-=5;
        this.want("learn to somethink");
        String word=this.name+" jealous "+korotishka.name;
        System.out.println(word);
        return word;
    }

    /**
     * want
     * @param think-what do you want
     * @return boolean
     */
    public boolean want(String think){
        if (think.equals("learn to somethink")){
            return true;
        }
        if (think.equals("working")){
            return false;
        }
        else{
            return true;
        }
    }

    /**
     * thought
     * @param how
     * @return word
     */
    public String thought(HowGood how){
        String word;
        if(how.equals(HowGood.BAD)){
            word=this.name+"thought badly, but he put the boots on our feet and not on our heads";
            this.had="not completely empty";
            this.hadThink="completely empty";
        }
        else{
            word=this.name+"thought "+how.toString();
            this.had="normal";
            this.hadThink="normal";
        }
        return word;
    }

    /**
     * doing
     * @return word
     */
    public String doing(){
        String how;
        if (!this.want("learn to somethink") | !this.want("working")){
            read(HowSpeed.SLOWLY);
            write(HowSpeed.SLOWLY);
            how="inside out";
        }
        else{
            read(HowSpeed.NORMAL);
            write(HowSpeed.NORMAL);
            how="normal";
        }
        String word=this.name+" doing all "+how;
        System.out.println(word);
        return word;
    }

    /**
     * read
     * @param howSpeed
     * @return word
     */
    public String read(HowSpeed howSpeed){
        String how;
        if (howSpeed.equals(HowSpeed.SLOWLY)){
            how="by syllables";
        }
        else{
            how="normal";
        }
        String word=this.name+" can read "+how;
        System.out.println(word);
        return word;
    }

    /**
     * write
     * @param howSpeed
     * @return word
     */
    public String write(HowSpeed howSpeed){
        String how;
        if (howSpeed.equals(HowSpeed.SLOWLY)){
            how="in block letters";
        }
        else{
            how="normal";
        }
        String word=this.name+" can read "+how;
        System.out.println(word);
        return word;
    }

    /**
     * chat
     * @param korotishki
     * @return word
     */
    public String chat(Korotishki korotishki){
        String word;
        if (korotishki.equals(this.friend)){
            word=this.name+" could chat with "+korotishki.name+" for hours at a time.";
        }
        else{
            word=this.name+" could not chat with "+korotishki.name+" for hours at a time.";
        }
        System.out.println(word);
        return word;
    }

    /**
     * be friends
     * @param korotishki
     * @return word
     */
    public String befriends(Korotishki korotishki){
        String word;
        if (korotishki.equals(this.friend)){
            word="They quarreled twenty times a day and made up twenty times a day";
        }
        else{
            word="They aren't friends.";
        }
        System.out.println(word);
        return word;
    }

    /**
     * like colors
     * @return color
     */
    public String likeColors(){
        return "bright";
    }

    /**
     * dress
     * @return word
     */
    public String dress(){
        String word;
        if (this.likeColors().equals("bright")){
            word=this.name+"dressed up as such a parrot";
        }
        else{
            word="dressed up as such a normal person";
        }
        System.out.println(word);
        return word;
    }

    /**
     * hang arround
     * @param howLong
     * @param where
     * @return
     */
    public String hangArround(String howLong, String where){
        String word=this.name+" hang arround "+howLong+" "+where;
        System.out.println(word);
        return word;
    }

    /**
     * tell
     * @param story
     * @return word
     */
    public String tell(String story){
        String word="- "+story;
        System.out.println(word);
        return word;
    }

    /**
     * composing
     * @return story
     */
    public String composing(){
        String word="composing new tall tales";
        String story="it is some story";
        System.out.println(word);
        return story;
    }

    /**
     * offend
     * @param korotishka
     * @return word
     */
    public String offend(Korotishki korotishka){
        String word;
        if (this.power>korotishka.power){
            word=this.name +" offed "+korotishka.name;
        }
        else{
            word=korotishka.name +" offed "+this.name;
        }
        return word;
    }
    int knowladge=0;


    /**
     * a lot of String methods: walk, trundle, goHome, run, cry
     *
     * @return word
     */
    public String walk() {
        String word = "Neznaika walk and go to field.";
        System.out.println(word);
        return (word);
    }

    /**
     * trundle
     * @return word
     */
    public String trundle() {
        String word = "Neznaika trundle.";
        System.out.println(word);
        return (word);
    }

    /**
     * go home
     * @return word
     */
    public String goHome() {
        String word = "Neznaika go home.";
        System.out.println(word);
        return (word);
    }

    /**run
     *
     * @return word
     */
    public String run() {
        String word = "Neznaika run.";
        System.out.println(word);
        return (word);
    }

    /**
     * cry
     * @param word-what cry
     * @return
     */
    public String cry(String word) {
        System.out.println(word);
        return (word);
    }

    /**
     * String methods (play in Musician instruments): strum, scrape, blow
     *
     * @return word
     */
    public void strum() {
        System.out.println("Neznaika start to strum.");
    }

    /**
     * scrape
     */
    public void scrape() {
        System.out.println("Neznaika start to scrape.");
    }

    /**
     * void blow
     */
    public void blow() {
        System.out.println("Neznaika start to blow.");
        /**
         * lockal class Tumped
         * doing something if Dunno blow
         */
        class Tumpet {
            public Tumpet() {
            }

            public void roar() {
                System.out.println("Tumpet roar.");
            }

            public void roared() {
                System.out.println("Tumpet roared.");
            }

            public void wheezed() {
                System.out.println("Tumpet wheezed.");
            }

            public void screamed() {
                System.out.println("Tumpet scremed.");
            }

            public void grunted() {
                System.out.println("Tumpet grunted.");
            }
        }
        Tumpet tumpet = new Tumpet();
        tumpet.grunted();
        tumpet.roar();
        tumpet.roared();
        tumpet.wheezed();
        tumpet.screamed();
    }

    /**
     * String method ask to give
     *
     * @param korotishka
     * @return word
     */
    public String askToGive(Korotishki korotishka) {
        String word = "Neznaika began to ask the " + korotishka.name + " to give him tool";
        System.out.println(word);
        return word;
    }

    @Override
    public boolean love(String food){
        if (food.equals("kastorka")){
            return false;
        }
        else{
            return true;
        }
    }

    //Neznaika create new portrait and draw some character
    @Override
    public Portrait.Face draw(Korotishki korotishka) {
        if (korotishka.name == "Gunka") {
            System.out.println(", and " + name + " began to draw it.");
            Portrait.Face portraitGunki = new Portrait.Face("PortraitGunki");
            portraitGunki.nose = RED;
            portraitGunki.ears = GREEN;
            portraitGunki.lips = BLUE;
            portraitGunki.eyes = ORANGE;
            System.out.println(name + " wanted to make Gunka look prettier, so he drew him a " + portraitGunki.nose.toString() + " nose, " + portraitGunki.ears.toString() + " ears, " + portraitGunki.lips.toString() + " lips, and " + portraitGunki.eyes.toString() + " eyes.");
            return portraitGunki;
        }
        if (korotishka.name == "Pilulkin") {
            System.out.println(name + " began to draw " + korotishka.name);
            Portrait.Face portraitPilulkin = new Portrait.Face("PortraitPilulkin");
            portraitPilulkin.nose = RED;
            portraitPilulkin.ears = SKIN;
            portraitPilulkin.lips = RED;
            portraitPilulkin.eyes = BLUE;
            return portraitPilulkin;
        }
        return null;
    }

    @Override
    public Portrait.Body drawBodyPortrait(Korotishki korotishki) {
        if (korotishki.name == "Ponchik") {
            System.out.println(name + " began to draw " + korotishki.name);
            Portrait.Body portraitPonchik = new Portrait.Body("PortraitPonchik", Thickness.THICK, Thickness.THICK, Thickness.THICK, Thickness.THICK, Thickness.THICK);
            return portraitPonchik;
        }
        if (korotishki.name == "Toropigka") {
            System.out.println(name + " began to draw " + korotishki.name);
            Portrait.Body portraitToropigka = new Portrait.Body("PortraitToropigka");
            portraitToropigka.arms = Thickness.NORMAL;
            portraitToropigka.belly = Thickness.NORMAL;
            portraitToropigka.had = Thickness.NORMAL;
            portraitToropigka.legs = Thickness.THIN;
            return portraitToropigka;
        }
        return null;
    }

    //Neznaika add something to the portrait
    @Override
    public Portrait.Face drawDetail(Portrait.Face portrait, Colors color) {
        portrait.mustache = color;
        System.out.println(" and added a " + portrait.mustache.toString().toLowerCase() + " mustache.");
        return portrait;
    }

    //Neznaika can speak, exclaim and ask in the story different words at different moments in story


    @Override
    public String speak() {
        String word = "";
        System.out.print(name + " said:    ");
        Time.getInstance().time += 1;
        if (Time.getInstance().time == 2) {
            word = "- Sit down Gunka, I'll draw you now.";
        }
        if (Time.getInstance().time == 3) {
            word = "- Don't move, don't move. It doesn't look like it's going to work.";
        }
        if (Time.getInstance().time == 8) {
            word = "- Ok, ok, don't worry";
        }
        if (Time.getInstance().time == 103) {
            word = "- So it was something that fell on me from the sun. A piece of the sun must have come off and hit me on the head";
        }
        if (Time.getInstance().time == 104) {
            word = "- Listen, Steklyashkin. You know what the story is: a piece of the sun broke off and hit me on the head.";
        }
        System.out.println(word);
        return word;
    }

    @Override
    public String exclaim() {
        String word = "";
        System.out.print(name + " exclaim:    ");
        Time.getInstance().time += 1;
        if (Time.getInstance().time == 5) {
            word = "- It looks like it!";
        }
        System.out.println(word);
        return word;
    }

    @Override
    public String ask() {
        String word = "";
        System.out.print(name + " ask:    ");
        Time.getInstance().time += 1;
        if (Time.getInstance().time == 102) {
            word = "Who hit me? Did something fall from above?";
        }
        System.out.println(word);
        return word;
    }
    @Override
    public void writePoety() {
        this.beganToaWanderAboutTheRoom();
        this.lookUpAtTheCeiling();
        this.starAtTheFloor();
        this.putHisHandsUnderHisChin();
        this.mutteringToHimselfUnderHisBreath();
    }
}
