package com.leacox.motif.pattern;

import com.leacox.motif.matchers.Matcher;

import java.util.List;

/**
 * @author John Leacox
 */
class ArgumentsComparator {
  private ArgumentsComparator() {
  }

  public static boolean argumentsMatch(Matcher[] matchers, List<Object> args) {
    if (matchers.length != args.size()) {
      return false;
    }

    for (int i = 0; i < matchers.length; i++) {
      if (!matchers[i].matches(args.get(i))) {
        return false;
      }
    }

    return true;
  }
}
