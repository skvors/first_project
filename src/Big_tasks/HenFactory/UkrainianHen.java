package Big_tasks.HenFactory;




public class UkrainianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE +  ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
