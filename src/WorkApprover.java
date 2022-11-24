public abstract class WorkApprover {
    protected WorkApprover nextApprover;

    public void SetNextApprover(WorkApprover nextApprover)
    {
        this.nextApprover = nextApprover;
    }

    public abstract void ApproveWork(Work i);
}