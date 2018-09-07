package Big_tasks.HenFactory;




public class BelarusianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS +  ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
