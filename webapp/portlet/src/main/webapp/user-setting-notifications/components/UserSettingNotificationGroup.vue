<template>
  <div v-if="group && group.pluginInfos && group.pluginInfos.length" class="border-radius border-color ma-4">
    <v-list-item dense>
      <v-list-item-content>
        <v-list-item-title class="text-color font-weight-bold subtitle-1">
          {{ label }}
        </v-list-item-title>
      </v-list-item-content>
    </v-list-item>

    <user-setting-notification-plugin
      v-for="plugin in group.pluginInfos"
      :plugin="plugin"
      :key="plugin.type"
      :settings="settings"
      @edit="$emit('edit', plugin, group)" />
  </div>
</template>

<script>
export default {
  props: {
    group: {
      type: Object,
      default: null,
    },
    settings: {
      type: Object,
      default: null,
    },
  },
  computed: {
    label() {
      return this.settings && this.settings.groupsLabels && this.settings.groupsLabels[this.group.groupId];
    },
  },
  methods: {
    openNotificationSettingDetail() {
      // TODO
    },
  },
};
</script>

