<template>
  <v-toolbar id="usersManagementToolbar" flat>
    <v-toolbar-title class="nav-collapse overflow-visible">
      <div class="btn-group">
        <v-btn
          class="btn btn-primary addNewUserButton"
          @click="$root.$emit('addNewUser')">
          <i class="uiIconAddUser uiIconWhite mr-md-3"></i>
          <span class="d-none d-sm-inline">
            {{ $t('UsersManagement.addUser') }}
          </span>
        </v-btn>
        <v-btn
          class="btn btn-primary dropdown-toggle width-auto pa-0"
          data-toggle="dropdown">
          <span class="caret my-0 mx-3"></span>
        </v-btn>
        <div v-if="initialized" class="dropdown-menu">
          <users-management-import-csv-button />
        </div>
      </div>
    </v-toolbar-title>
    <v-spacer></v-spacer>
    <v-scale-transition>
      <v-text-field
        v-model="keyword"
        :placeholder="$t('UsersManagement.filterBy')"
        prepend-inner-icon="fa-filter"
        class="inputUserFilter pa-0 mr-3 my-auto" />
    </v-scale-transition>
    <v-scale-transition>
      <select
        v-model="filter"
        class="selectUsersFilter width-auto my-auto mr-2 pr-2 subtitle-1 ignore-vuetify-classes d-none d-sm-inline">
        <option value="ENABLED">
          {{ $t('UsersManagement.status.enabled') }}
        </option>
        <option value="DISABLED">
          {{ $t('UsersManagement.status.disabled') }}
        </option>
      </select>
    </v-scale-transition>
  </v-toolbar>
</template>

<script>
export default {
  data: () => ({
    filter: 'ENABLED',
    initialized: false,
    keyword: null,
  }),
  watch: {
    keyword() {
      this.$root.$emit('searchUser', this.keyword, this.filter);
    },
    filter() {
      this.$root.$emit('searchUser', this.keyword, this.filter);
    },
  },
  updated() {
    // Workaround to hide DropDown Menu on initialization
    // that causes html breaking sometimes
    window.setTimeout(() => this.initialized = true, 1000);
  },
};
</script>
