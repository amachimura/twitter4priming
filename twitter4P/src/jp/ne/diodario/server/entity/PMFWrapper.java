package jp.ne.diodario.server.entity;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

public final class PMFWrapper {
    private static final PersistenceManagerFactory pmfInstance =
            JDOHelper.getPersistenceManagerFactory("transactions-optional");

        /**
         * ‰B‚Ø‚¢
         */
        private PMFWrapper() {}

        public static PersistenceManagerFactory get() {
            return pmfInstance;
        }
}
