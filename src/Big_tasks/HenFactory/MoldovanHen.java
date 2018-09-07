package Big_tasks.HenFactory;




public class MoldovanHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth() {
        return 40;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA +  ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
