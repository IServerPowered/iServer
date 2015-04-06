package net.minecraft.server;

import com.google.common.base.Predicate;

final class PlayerSelectorInnerClass6 implements Predicate {

    final String a;
    final boolean b;

    PlayerSelectorInnerClass6(String s, boolean flag) {
        this.a = s;
        this.b = flag;
    }

    public boolean a(Entity entity) {
        return entity.getName().equals(this.a) != this.b;
    }

    public boolean apply(Object object) {
        return this.a((Entity) object);
    }
}