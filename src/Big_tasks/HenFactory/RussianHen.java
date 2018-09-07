package Big_tasks.HenFactory;




public class RussianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth() {
        return 34;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
