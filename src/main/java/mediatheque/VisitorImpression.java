package mediatheque;

public abstract class VisitorImpression implements Visitor{
    public abstract void visit(Book book);
    public abstract void visit(CD cd);
}